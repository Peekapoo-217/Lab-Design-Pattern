package state;

import models.Document;

/**
 * State interface định nghĩa các method chung cho mọi trạng thái của tài liệu.
 */

public interface State {
	void edit(Document doc);
	void save(Document doc);
}
