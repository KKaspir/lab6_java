/* 9) Шаблон класса */
/* Шаблонный класс Box, который может хранить объекты разных типов */
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

