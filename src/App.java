import views.View;

import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        //CREAR VISTA
        View vista = new View();


        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        Controller controller = new Controller(vista, sortingMethods, searchMethods);

    }
}
