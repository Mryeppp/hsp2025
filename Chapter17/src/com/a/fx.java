package com.a;
// vscode jdk8以上的编译器无法运行此文件
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class fx extends Application {
    @Override
    public void start(Stage primaryStage) {
        // 创建一个 Pane 作为根节点
        Pane root = new Pane();

        // 创建一个圆
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setFill(Color.BLUE);

        // 将圆添加到 Pane 中
        root.getChildren().add(circle);

        // 创建一个场景并设置到舞台上
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX Circle Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/**
 * 在终端这样编译运行是可以的
 * javac --module-path "D:\javafx\lib" --add-modules javafx.controls -d . src/com/a/fx.java
 * java --module-path "D:\javafx\lib" --add-modules javafx.controls com.a.fx
 */