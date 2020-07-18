package enumeration;

/**
 * @author JavaZ5G
 * @date 2020/6/21 5:56 PM
 */
public enum ResponseCodeEnum {
    /**
     * 成功
     */
    success(1000),
    /**
     * 失败
     */
    fail(2000);

    private int value;

    ResponseCodeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
