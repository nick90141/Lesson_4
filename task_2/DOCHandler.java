package task_2;

public class DOCHandler extends AbstractHandler{

    @Override
    public void open(){
        System.out.println("DOC open");
    }
    @Override
    public void create(){
        System.out.println("DOC create");
    }
    @Override
    public void change(){
        System.out.println("DOC change");
    }
    @Override
    public void save(){
        System.out.println("DOC save");
    }

}
