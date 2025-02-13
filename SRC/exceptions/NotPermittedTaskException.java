package exceptions;

public class NotPermittedTaskException extends Exception {
    public NotPermittedTaskException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: Рабочий не может делать что либо без указания мастера!\nСовет: Вы можете разблокировать действие и подвергнуть рабочего опасности, использовав ISlave.unlockNextAction()\n " + super.getMessage();
    }   
}
