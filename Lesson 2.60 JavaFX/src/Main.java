// Lesson 2.66
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) {
        // Створюємо вісь ОХ та ОY.
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        // Створюємо координатну площину XOY.
        LineChart<Number, Number> numberLineChart = new LineChart<Number, Number>(x, y);

        // Створюємо графік функції sinx.
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("y=x^2");
        ObservableList<XYChart.Data> datas = FXCollections.observableArrayList();

        // Визначаємо значення функції в діапазоні від 0 до 20 по осі ОХ.
        for (int i = 0; i < 20; i++) {
            datas.add(new XYChart.Data(i, i*i));
        }

        series1.setData(datas);

        // Відображаємо графік на панелі вікна.
        Scene scene = new Scene(numberLineChart, 600, 600);
        numberLineChart.getData().add(series1);

        Stage stage = new Stage(); // Uncomment this line
        stage.setScene(scene);
        stage.setTitle("y=x^2");
        stage.setWidth(1024);
        stage.setHeight(700);
        stage.show();
    }
}

    /*

    public static void main(String[] args) {
        //Створюємо вісь ОХ та ОY.
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();
//Створюємо координатну площину XOY.
        LineChart<Number, Number> numberLineChart = new LineChart<Number, Number>(x,y);
//Створюємо графік функції sinx.
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("sin(x)");
        ObservableList<XYChart.Data> datas = FXCollections.observableArrayList();
//Визначаємо значення функції в діапазоні від 0 до 20 по осі ОХ.
        for(int i=0; i<20; i++){
            datas.add(new XYChart.Data(i,Math.sin(i)));
        }
        series1.setData(datas);
//Відображаємо графік на панелі вікна.
        Scene scene = new Scene(numberLineChart, 600, 600);
        numberLineChart.getData().add(series1);
        //Stage stage = new Stage();//
        stage.setScene(scene);
        stage.setTitle("sin x");
        stage.setWidth(1024);
        stage.setHeight(700);
        stage.show();
    }
}




//Lesson 2.64



/*

import javafx.application.Application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.AreaChart;


//Lesson 2.64

public class Main extends Application {
    String a="";
    String b="";
    boolean firstNumber = true;
    boolean dot = true;
    String sign;
    TextField display = new TextField();
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage)
    {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        Button button0 = new Button("0");
        button0.setPrefSize(50, 25);button0.setFont(Font.font(16));
        Button button1 = new Button("1");
        button1.setPrefSize(50, 25);button1.setFont(Font.font(16));
        Button button2 = new Button("2");
        button2.setPrefSize(50, 25);button2.setFont(Font.font(16));
        Button button3 = new Button("3");
        button3.setPrefSize(50, 25);button3.setFont(Font.font(16));
        Button button4 = new Button("4");
        button4.setPrefSize(50, 25);button4.setFont(Font.font(16));
        Button button5 = new Button("5");
        button5.setPrefSize(50, 25);button5.setFont(Font.font(16));
        Button button6 = new Button("6");
        button6.setPrefSize(50, 25);button6.setFont(Font.font(16));
        Button button7 = new Button("7");
        button7.setPrefSize(50, 25);button7.setFont(Font.font(16));
        Button button8 = new Button("8");
        button8.setPrefSize(50, 25);button8.setFont(Font.font(16));
        Button button9 = new Button("9");
        button9.setPrefSize(50, 25);button9.setFont(Font.font(16));
        Button buttonDot = new Button(".");
        buttonDot.setPrefSize(50, 25);
        buttonDot.setFont(Font.font(16));
        buttonDot.setOnAction(new PressDot());
        Button buttonPlusOrMinus = new Button("+/-");
        buttonPlusOrMinus.setPrefSize(50, 25);
        buttonPlusOrMinus.setFont(Font.font(16));
        buttonPlusOrMinus.setOnAction(new PressMinus());

        button0.setOnAction(new PressNumber());
        button1.setOnAction(new PressNumber());
        button2.setOnAction(new PressNumber());
        button3.setOnAction(new PressNumber());
        button4.setOnAction(new PressNumber());
        button5.setOnAction(new PressNumber());
        button6.setOnAction(new PressNumber());
        button7.setOnAction(new PressNumber());
        button8.setOnAction(new PressNumber());
        button9.setOnAction(new PressNumber());

        root.add(button0, 0, 0);
        root.add(button1, 1, 0);
        root.add(button2, 2, 0);
        root.add(button3, 3, 0);
        root.add(button4, 0, 1);
        root.add(button5, 1, 1);
        root.add(button6, 2, 1);
        root.add(button7, 3, 1);
        root.add(button8, 0, 2);
        root.add(button9, 1, 2);
        root.add(buttonDot, 2, 2);
        root.add(buttonPlusOrMinus, 3, 2);
        Button buttonPlus = new Button("+");
        buttonPlus.setPrefSize(50, 25); buttonPlus.setFont(Font.font(16));
        Button buttonMinus = new Button("-");
        buttonMinus.setPrefSize(50, 25);
        buttonMinus.setFont(Font.font(16));
        Button buttonMultiply = new Button("x");
        buttonMultiply.setPrefSize(50, 25);
        buttonMultiply.setFont(Font.font(16));
        Button buttonDiv = new Button("/");
        buttonDiv.setPrefSize(50, 25);
        buttonDiv.setFont(Font.font(16));
        buttonPlus.setOnAction(new PressSign());
        buttonMinus.setOnAction(new PressSign());
        buttonMultiply.setOnAction(new PressSign());
        buttonDiv.setOnAction(new PressSign());
        root.add(buttonPlus, 0, 3);
        root.add(buttonMinus, 1, 3);
        root.add(buttonMultiply, 2, 3);
        root.add(buttonDiv, 3, 3);
        Button buttonEqual = new Button("=");
        buttonEqual.setPrefSize(50, 25);
        buttonEqual.setFont(Font.font(16));
        buttonEqual.setOnAction(new PressResult());
        Button buttonClear = new Button("C");
        buttonClear.setPrefSize(50, 25);
        buttonClear.setFont(Font.font(16));
        buttonClear.setOnAction(new PressClear());
        Button buttonBack = new Button("<-");
        buttonBack.setPrefSize(50, 25);
        buttonBack.setFont(Font.font(16));
        buttonBack.setOnAction(new PressBack());

        Button buttonMod = new Button("|x|");
        buttonMod.setPrefSize(50, 25);
        buttonMod.setFont(Font.font(16));
        buttonMod.setOnAction(new PressModul());

        root.add(buttonMod, 0, 4);
        root.add(buttonBack, 1, 4);
        root.add(buttonClear, 2, 4);
        root.add(buttonEqual, 3, 4);
        display.setPrefSize(10,10);
        display.setFont(Font.font(14));
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.add(display,0,0);
        GridPane.setMargin(display, new Insets(0,0,10,0));
        pane.add(root,0,1);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setHeight(400);
        stage.setWidth(300);
        stage.show();

    }
    class PressNumber implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            display.appendText(((Button)event.getSource()).getText());
            if(firstNumber){
                a+=((Button)event.getSource()).getText();
            }
            else{
                b+=((Button)event.getSource()).getText();
            }
        }
    }
    class PressDot implements EventHandler<ActionEvent>{
//        @Override
        public void handle(ActionEvent event) {
            if(!dot) return;
            display.appendText(((Button)event.getSource()).getText());
            if(firstNumber){
                a+=((Button)event.getSource()).getText();
            }
            else{
                b+=((Button)event.getSource()).getText();
            }
            dot=false;
        }
    }
    class PressSign implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            sign = ((Button)event.getSource()).getText();
            display.clear();
            firstNumber = false;
            dot = true;
        }
    }
    class PressResult implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            display.clear();
            Float rez;
            switch (sign){
                case "+":
                    rez= Float.parseFloat(a)+Float.parseFloat(b);
                    display.setText(""+rez);
                    break;
                case "-":
                    rez = Float.parseFloat(a)-Float.parseFloat(b);
                    display.setText(""+rez);
                    break;
                case "x":
                    rez = Float.parseFloat(a)*Float.parseFloat(b);
                    display.setText(""+rez);
                    break;
                case "/":
                    rez = Float.parseFloat(a)/Float.parseFloat(b);
                    display.setText(""+rez);
                    break;
                default:
                    break;
            }
                a = "";
                a = display.getText();
                firstNumber = false;
                dot = true;
        }
    }
    class PressClear implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            display.clear();
            a="";
            b="";
            firstNumber = true;
            dot = true;
        }
    }
    private boolean negativeA=false;
    private boolean negativeB=false;
    class PressMinus implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            if (firstNumber){
                if (negativeA){
                    a=a.substring(1, a.length());
                    display.setText(a);
                    negativeA=false;
                }
                else {
                    a="-"+a;
                    display.setText(a);
                    negativeA=true;
                }
            }
            else {
                if (negativeB){
                    b=b.substring(1,b.length());
                    display.setText(b);
                    negativeB=false;
                }
                else{
                    b="-"+b;
                    display.setText(b);
                    negativeB=true;
                }
            }
        }
    }
    class PressModul implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            if (firstNumber){
                if (negativeA){
                    a=a.substring(1,a.length());
                    display.setText(a);
                    negativeA = false;
                }
            }
            else {
                if (negativeB){
                    b=b.substring(1,b.length());
                    display.setText(b);
                    negativeB = false;
                }
            }
        }
    }
    class PressBack implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            if(firstNumber){
                if (!a.equals("")){
                    a=a.substring(0, a.length()-1);
                    display.setText(a);
                }
            }
            else {
                if (!b.equals("")) {
                    b = b.substring(0, b.length() - 1);
                    display.setText(b);
                }
            }
        }
    }
}

*/





/*
// Lesson 61
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
//Перевизначаємо метод start.
    @Override
    public void start(Stage stage){
        Label label = new Label("Enter the job:");
        ObservableList<String> country = FXCollections.observableArrayList("Java Developer", "Data Analyst", "DevOps", "Data Scientist", "Admin of DB", "QA Engineer");
        ListView<String> list = new ListView<>(country);
        list.setPrefSize(150,150);
        list.setLayoutY(20);
        Label salary = new Label("Enter desired salary:");
        salary.setLayoutY(200);
        Slider slider = new Slider(10_000,100_000, 20_000);
        slider.setMajorTickUnit(20_000);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setLayoutX(10);
        slider.setLayoutY(230);
        Label text = new Label();
        text.setLayoutY(350);
        text.setLayoutX(10);
        Button ok = new Button("OK");
        ok.setLayoutX(10);
        ok.setLayoutY(300);
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String selectedItem = list.getSelectionModel().getSelectedItem();
                double selectedSalary = slider.getValue();
                text.setText("Thank you for your application. For vacancy "+selectedItem+"\n with the amount of salary "+(int)selectedSalary+" . Our manager will contact you.");
            }
        });
        Group group = new Group(label, list, salary, slider, ok, text);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setHeight(450);
        stage.setWidth(500);
        stage.setTitle("Task 1");
        stage.show();
    }
}
 */

// Lesson 60
/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    TextField name;
    RadioButton javabutton;
    RadioButton csharp;
    ToggleGroup tgroup;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        Label label1 = new Label("Enter your name: ");
        name = new TextField();
        name.setLayoutX(100);
        javabutton = new RadioButton("Java");
        javabutton.setLayoutY(40);
        csharp = new RadioButton("C#");
        csharp.setLayoutY(80);
        tgroup = new ToggleGroup();
        javabutton.setToggleGroup(tgroup);
        csharp.setToggleGroup(tgroup);
        Button ok = new Button("OK");
        ok.setLayoutX(120);
        ok.setLayoutY(120);
        ok.setOnAction(new PressOK());
        Group group = new Group(label1, name, javabutton, csharp, ok);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Lesson 60");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();

        /*
     // Radio Button
        RadioButton java = new RadioButton("Java");
        RadioButton cplus = new RadioButton("C++");
        java.setLayoutY(20);
        RadioButton csharp = new RadioButton("C#");
        csharp.setLayoutY(40);

        //Stvorennia effect radio knopky
        ToggleGroup tgroup = new ToggleGroup();
        java.setToggleGroup(tgroup);
        cplus.setToggleGroup(tgroup);
        csharp.setToggleGroup(tgroup);

        Group group = new Group(java, cplus,csharp);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Lesson 60");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();

         */


        //Check Boxes
/*
        CheckBox java = new CheckBox("Java");
        java.setSelected(true);
        CheckBox cplus = new CheckBox("C++");
        cplus.setLayoutY(20);
        cplus.setAllowIndeterminate(true);
        CheckBox csharp = new CheckBox("C#");
        csharp.setLayoutY(40);
        csharp.setAllowIndeterminate(true);
        csharp.setIndeterminate(true);
        Group group = new Group(java, cplus,csharp);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Lesson 60");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();
 */
        /*
        Label label = new Label("Java FX");

        Image image = new Image("Java.png");
        ImageView imageView = new ImageView(image);

        label.setLayoutX(100);
        label.setLayoutY(100);

        Button button = new Button("OK");
        button.setLayoutX(130);
        button.setLayoutY(130);
        button.setOnAction(new PressOK());

        Group group = new Group(label, button);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Lesson 60");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();
         */

/*
//Замість узагальненого типу Т вкажемо тип ActionEvent.
    class PressOK implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent var1){
            Stage stageNew = new Stage();
            String language = "";
            if(javabutton.isSelected()){
                language = "Java";
            }
            if(csharp.isSelected()){
                language = "C#";
            }
            Label label = new Label("Hello, "+name.getText()+"! You choose "+language+".");
            label.setLayoutX(100);
            label.setLayoutY(100);
            Group group = new Group(label);
            Scene scene = new Scene(group);
            stageNew.setScene(scene);
            stageNew.setTitle("Lesson 60");
            stageNew.setWidth(300);
            stageNew.setHeight(300);
            stageNew.show();
        }
    }
}
 */