package uas.model;

/**
 * 用户组
 * 
 * @author percy
 *
 */
public class Group {

	private String id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 编码
	 */
	private String code;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
