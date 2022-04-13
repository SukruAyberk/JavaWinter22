package day43_garbage_abstractClass;

public class C05_ChildOfAbstract extends C04 {

    /*
    Classımızı bir abstract classın child classı olarak belirtmek istersek
    ya child classı abstract yapmalıyız
    ya da child classa, parent classdaki abstract methodları override etmeliyiz

    Parent olan abstract classdaki concrete methodlar ise opsiyoneldir
    onları istersek override ederiz, istersek override etmeyiz
     */
    @Override
    public void absMethod1() {

    }
}
