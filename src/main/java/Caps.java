public class Caps implements ICrudAction {

    Caps(int count) {
        for (int i = 0; i < count; i++) {
            getCreate();
        }
    }

    public void getCreate() {
        System.out.println("Создан объект");
    }

    public void getRead() {

    }

    public void getUpdate() {

    }

    public void getDelete() {

    }
}
