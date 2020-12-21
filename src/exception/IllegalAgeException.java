package exception;

/**
 * 自定义异常
 * 自定义异常通常说明业务逻辑错误所表示的异常。
 *
 * 比如：年龄不合法异常
 *
 * @author wm
 *
 */
public class IllegalAgeException extends Exception {

    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
