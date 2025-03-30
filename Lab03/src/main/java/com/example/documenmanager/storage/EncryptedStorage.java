package main.java.com.example.documenmanager.storage;

public class EncryptedStorage implements Storage{
	private final Storage wrapped;

    public EncryptedStorage(Storage wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void upload(String filename, String content) {
        String encrypted = encrypt(content);
        System.out.println("Encrypting content before upload...");
        wrapped.upload(filename, encrypted);
    }

    @Override
    public String download(String filename) {
        String encrypted = wrapped.download(filename);
        System.out.println("Decrypting content after download...");
        return decrypt(encrypted);
    }
    
    private String encrypt(String content) {
        return new StringBuilder(content).reverse().toString();
    }

    private String decrypt(String content) {
        return new StringBuilder(content).reverse().toString();
    }
}
