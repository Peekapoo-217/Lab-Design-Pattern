package main.java.com.example.documenmanager.storage;

import java.util.HashMap;
import java.util.Map;

public class CachingStorage implements Storage{
	private final Storage wrapped;
    private final Map<String, String> cache = new HashMap<>();

    public CachingStorage(Storage wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void upload(String filename, String content) {
        cache.put(filename, content);
        wrapped.upload(filename, content);
    }

    @Override
    public String download(String filename) {
        if (cache.containsKey(filename)) {
            System.out.println("[Cache Hit] Returning cached content for: " + filename);
            return cache.get(filename);
        }
        System.out.println("[Cache Miss] Fetching from wrapped storage: " + filename);
        String content = wrapped.download(filename);
        cache.put(filename, content);
        return content;
    }
}
