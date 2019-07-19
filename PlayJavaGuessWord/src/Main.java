public class Main {

    public static void main(String[] args) {

        // Initialization
        PlayJava model = new PlayJava();
        View view = new View();
        Control controller = new Control(model, view);
        // Run
        controller.processUserInput();


      }
}
