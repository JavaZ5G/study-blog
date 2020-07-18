package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author JavaZ5G
 * @date 2020/6/21 5:42 PM
 */
@Data
public class BaseResponse implements Serializable {
    private String requestId;

    private Integer code;

    private String message;

    private Object data;

    public BaseResponse(String requestId, Integer code, String message, Object data) {
        this.requestId = requestId;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
