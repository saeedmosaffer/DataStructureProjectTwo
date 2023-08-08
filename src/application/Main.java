package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	static Stack stack = new Stack(500);

	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			BorderPane Root = new BorderPane();
			Root.setTop(root);
			/*
			 * create a GridPane and BorderPane and link the tow Panes together put the
			 * GridPane inside the BorderPane
			 */

			root.setPadding(new Insets(15, 15, 15, 15)); // set the padding
			root.setVgap(10);
			root.setHgap(10);

			Label response = new Label(); // label to show a error massage if you are not entered any operation

			TextArea t1 = new TextArea(); // create a Text Area
			t1.setPrefSize(500, 45); // set the size of the Text Area
			t1.setStyle("-fx-background-color: #f3a683;"); // set the color of the Text Area

			TextField t2 = new TextField(); // create a Text Area
			t2.setPrefSize(500, 45); // set the size of the Text Area
			t2.setStyle("-fx-background-color: #f7d794;"); // set the color of the Text Area

			TextField t3 = new TextField(); // create a Text Area
			t3.setPrefSize(500, 25); // set the size of the Text Area
			t3.setStyle("-fx-background-color: #ffcccc;"); // set the color of the Text Area

			Button b1 = new Button("1"); // create a button
			b1.setPrefSize(43, 25); // set the size of button
			b1.setStyle("-fx-background-color: #2d3436;"); // set the color of the button
			b1.setOnAction(event -> t1.setText(t1.getText() + "1")); // turn on the action on the button

			Button b2 = new Button("2"); // create a button
			b2.setPrefSize(43, 25); // set the size of button
			b2.setStyle("-fx-background-color: #2d3436;"); // set the color of the button
			b2.setOnAction(event -> t1.setText(t1.getText() + "2")); // turn on the action on the button

			Button b3 = new Button("3"); // create a button
			b3.setPrefSize(43, 25); // set the size of button
			b3.setStyle("-fx-background-color: #2d3436;"); // set the color of the button
			b3.setOnAction(event -> t1.setText(t1.getText() + "3")); // turn on the action on the button

			Button b4 = new Button("4"); // create a button
			b4.setPrefSize(43, 25); // set the size of button
			b4.setStyle("-fx-background-color: #2d3436;"); // set the color of the button
			b4.setOnAction(event -> t1.setText(t1.getText() + "4")); // turn on the action on the button

			Button b5 = new Button("5"); // create a button
			b5.setPrefSize(43, 25); // set the size of button
			b5.setStyle("-fx-background-color: #2d3436;"); // set the color of the button
			b5.setOnAction(event -> t1.setText(t1.getText() + "5")); // turn on the action on the button

			Button b6 = new Button("6"); // create a button
			b6.setPrefSize(43, 25);
			b6.setStyle("-fx-background-color: #2d3436;");
			b6.setOnAction(event -> t1.setText(t1.getText() + "6")); // turn on the action on the button

			Button b7 = new Button("7"); // create a button
			b7.setPrefSize(43, 25);
			b7.setStyle("-fx-background-color: #2d3436;");
			b7.setOnAction(event -> t1.setText(t1.getText() + "7")); // turn on the action on the button

			Button b8 = new Button("8"); // create a button
			b8.setPrefSize(43, 25);
			b8.setStyle("-fx-background-color: #2d3436;");
			b8.setOnAction(event -> t1.setText(t1.getText() + "8")); // turn on the action on the button

			Button b9 = new Button("9"); // create a button
			b9.setPrefSize(43, 25);
			b9.setStyle("-fx-background-color: #2d3436;");
			b9.setOnAction(event -> t1.setText(t1.getText() + "9")); // turn on the action on the button

			Button b10 = new Button("0"); // create a button
			b10.setPrefSize(43, 25);
			b10.setStyle("-fx-background-color: #2d3436;");
			b10.setOnAction(event -> t1.setText(t1.getText() + "0")); // turn on the action on the button

			Button b11 = new Button("LOG"); // create a button
			b11.setPrefSize(43, 25);
			b11.setStyle("-fx-background-color: #54a0ff;");
			b11.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "log");
				t1.setText(t1.getText() + " ");
			});
			Button b12 = new Button("⁯⅟x⁯"); // create a button
			b12.setPrefSize(43, 25);
			b12.setStyle("-fx-background-color: #54a0ff;");
			b12.setOnAction(e -> {
				t1.setText(t1.getText() + "1");
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "÷");
				t1.setText(t1.getText() + " ");
			});
			Button b13 = new Button("."); // create a button
			b13.setPrefSize(43, 25);
			b13.setStyle("-fx-background-color: #7f8c8d;");
			b13.setOnAction(event -> t1.setText(t1.getText() + ".")); // turn on the action on the button

			Button b14 = new Button("%"); // create a button
			b14.setPrefSize(43, 25);
			b14.setStyle("-fx-background-color: #7f8c8d;");
			b14.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "%");
				t1.setText(t1.getText() + " ");
			});
			Button b15 = new Button("+"); // create a button
			b15.setPrefSize(43, 25);
			b15.setStyle("-fx-background-color: #7f8c8d;");
			b15.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "+");
				t1.setText(t1.getText() + " ");
			});
			Button b16 = new Button("←"); // create a button
			b16.setPrefSize(43, 25);
			b16.setStyle("-fx-background-color: #e74c3c;");
			b16.setOnAction(event -> {
				if (t1.getText() != null && !t1.getText().isEmpty()) {
					response.setText("");
					t1.setText(t1.getText().substring(0, t1.getText().length() - 1));
				} else {
					response.setText("the text is empty!");
				}

			}); // turn on the action on the button

			Button b17 = new Button("e^x"); // create a button
			b17.setPrefSize(43, 25);
			b17.setStyle("-fx-background-color: #54a0ff;");
			b17.setOnAction(event -> t1.setText(t1.getText() + "e")); // turn on the action on the button

			Button b18 = new Button("LN"); // create a button
			b18.setPrefSize(43, 25);
			b18.setStyle("-fx-background-color: #54a0ff;");
			b18.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "ln");
				t1.setText(t1.getText() + " ");
			});
			Button b19 = new Button("-"); // create a button
			b19.setPrefSize(43, 25);
			b19.setStyle("-fx-background-color: #7f8c8d;");
			b19.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "-");
				t1.setText(t1.getText() + " ");
			}); // turn on the action on the button

			Button b20 = new Button("C"); // create a button
			b20.setPrefSize(43, 25);
			b20.setStyle("-fx-background-color: #e74c3c;");
			b20.setOnAction(event -> {

				if (t1.getText() != null && !t1.getText().isEmpty()) {
					response.setText("");
					t1.clear();
					t2.clear();
					t3.setText("0");
					stack.clear();

				} else {
					response.setText("the text is empty!");
				}

			});

			Button b21 = new Button("X²"); // create a button
			b21.setPrefSize(43, 25);
			b21.setStyle("-fx-background-color: #54a0ff;");
			b21.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "^");
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "2");
			});
			Button b22 = new Button("√×"); // create a button
			b22.setPrefSize(43, 25);
			b22.setStyle("-fx-background-color: #54a0ff;");
			b22.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "√");
				t1.setText(t1.getText() + " ");
			});
			Button b23 = new Button("x"); // create a button
			b23.setPrefSize(43, 25);
			b23.setStyle("-fx-background-color: #7f8c8d;");
			b23.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "×");
				t1.setText(t1.getText() + " ");
			});
			Button b24 = new Button("CA"); // create a button
			b24.setPrefSize(43, 25);
			b24.setStyle("-fx-background-color: #e74c3c;");
			b24.setOnAction(e -> {
				t1.clear();
				t2.clear();
				t3.setText("0");
				stack.clear();
			}); // turn on the action on the button

			Button b25 = new Button("π"); // create a button
			b25.setPrefSize(43, 25);
			b25.setStyle("-fx-background-color: #54a0ff;");
			b25.setOnAction(event -> t1.setText(t1.getText() + "π")); // turn on the action on the button

			Button b26 = new Button("yˣ"); // create a button
			b26.setPrefSize(43, 25);
			b26.setStyle("-fx-background-color: #54a0ff;");
			b26.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "^");
				t1.setText(t1.getText() + " ");
			});
			Button b27 = new Button("÷"); // create a button
			b27.setPrefSize(43, 25);
			b27.setStyle("-fx-background-color: #7f8c8d;");
			b27.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "÷");
				t1.setText(t1.getText() + " ");
			});
			Button b28 = new Button("(-)"); // create a button
			b28.setPrefSize(43, 25);
			b28.setStyle("-fx-background-color: #ffffff; -fx-text-fill:black;");
			b28.setOnAction(event -> t1.setText(t1.getText() + "")); // turn on the action on the button

			Button b29 = new Button("sin"); // create a button
			b29.setPrefSize(43, 25);
			b29.setStyle("-fx-background-color: #54a0ff;");
			b29.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "sin");
				t1.setText(t1.getText() + " ");
			});
			Button b30 = new Button("cos"); // create a button
			b30.setPrefSize(43, 25);
			b30.setStyle("-fx-background-color: #54a0ff;");
			b30.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "cos");
				t1.setText(t1.getText() + " ");
			});
			Button b31 = new Button("tan"); // create a button
			b31.setPrefSize(43, 25);
			b31.setStyle("-fx-background-color: #54a0ff;");
			b31.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "tan");
				t1.setText(t1.getText() + " ");
			});
			Button b32 = new Button("("); // create a button
			b32.setPrefSize(43, 25);
			b32.setStyle("-fx-background-color: #ffffff; -fx-text-fill:black;");
			b32.setOnAction(e -> {
				t1.setText(t1.getText() + "(");
				t1.setText(t1.getText() + " ");
			});

			Button b33 = new Button(")"); // create a button
			b33.setPrefSize(43, 25);
			b33.setStyle("-fx-background-color: #ffffff; -fx-text-fill:black;");
			b33.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + ")");
			});
			Button b34 = new Button("!"); // create a button
			b34.setPrefSize(43, 25);
			b34.setStyle("-fx-background-color: #54a0ff;");
			b34.setOnAction(e -> {
				t1.setText(t1.getText() + " ");
				t1.setText(t1.getText() + "!");
				t1.setText(t1.getText() + " ");
			});
			Button b35 = new Button("OFF"); // create a button
			b35.setPrefSize(43, 25);
			b35.setStyle("-fx-background-color: #130f40;");
			b35.setOnAction(event -> {
				primaryStage.close();
				t1.clear();
				t2.clear();
				t3.clear();
				stack.clear();
			});
			
			Button b36 = new Button("="); // create a button
			b36.setPrefSize(331, 25);
			b36.setStyle("-fx-background-color: #686de0;");
			b36.setOnAction(event -> { // make the massage action
				t2.setText(infexToPostFix(t1.getText()));
				t3.setText(postFixedToEvaluiton(t2.getText()) + "");
				if (t1.getText() != null && !t1.getText().isEmpty()) {
					response.setText("");
				} else {
					response.setText("please inter a operation");
				}

			});

			Label l1 = new Label(); // create a label to make a space

			HBox v9 = new HBox(5); // create horizontal box to link the text area
			v9.getChildren().addAll(t1);
			root.add(v9, 1, 2); // set the location on the Pane

			HBox v10 = new HBox(5); // create horizontal box to link the text area
			v10.getChildren().addAll(t2);
			root.add(v10, 1, 3); // set the location on the Pane

			HBox v11 = new HBox(5); // create horizontal box to link the text area
			v11.getChildren().addAll(t3);
			root.add(v11, 1, 4); // set the location on the Pane

			HBox v12 = new HBox(5); // create horizontal box to link the label
			v12.getChildren().addAll(l1);
			root.add(v12, 1, 5); // set the location on the Pane

			HBox v1 = new HBox(5); // create horizontal box to link the buttons or the texts
			v1.getChildren().addAll(b11, b12, b10, b13, b14, b15, b16);
			root.add(v1, 1, 6); // set the location on the Pane

			HBox v2 = new HBox(5); // create horizontal box to link the buttons or the texts
			v2.getChildren().addAll(b17, b18, b1, b2, b3, b19, b20);
			root.add(v2, 1, 7); // set the location on the Pane

			HBox v3 = new HBox(5); // create horizontal box to link the buttons
			v3.getChildren().addAll(b21, b22, b4, b5, b6, b23, b24);
			root.add(v3, 1, 8); // set the location on the Pane

			HBox v4 = new HBox(5); // create horizontal box to link the buttons
			v4.getChildren().addAll(b25, b26, b7, b8, b9, b27, b28);
			root.add(v4, 1, 9); // set the location on the Pane

			HBox v5 = new HBox(5); // create horizontal box to link the buttons
			v5.getChildren().addAll(b29, b30, b31, b32, b33, b34, b35);
			root.add(v5, 1, 10); // set the location on the Pane

			HBox v6 = new HBox(5); // create horizontal box to link the buttons
			v6.getChildren().addAll(b36);
			root.add(v6, 5, 11); // set the location on the Pane

			HBox v13 = new HBox(5); // create horizontal box to link the buttons
			v13.getChildren().addAll(response); // link the massage label
			root.add(v13, 5, 12); // set the location on the Pane

			VBox v7 = new VBox(5); // create virtual box to link the horizontal boxes
			v7.getChildren().addAll(v9, v10, v11, v12, v5, v4, v3, v2, v1, v6, v13);
			root.add(v7, 1, 1); // set the location on the Pane

			Scene scene = new Scene(Root, 370, 385);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator ©"); // set the title
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

//	private static boolean error(String exp) {
//		char[] chars = exp.toCharArray();
//		Stack stack = new Stack();
//		for (char c : chars) {
//			if (c == '(') {
//				stack.push(c);
//			} else if (c == ')') {
//				if (stack.isEmpty()) {
//					return false;
//				}
//				char top = stack.pop();
//				if (c == ')' && top != '(') {
//					return false;
//				}
//			}
//		}
//		return stack.isEmpty();
//	}

	/*
	 * The order of priority in all arithmetic operations
	 */
	public static int priority_order(String c) {
		switch (c) {
		case "+":
		case "-":
			return 1;
		case "×":
		case "÷":
			return 2;
		case "^":
		case "sin":
		case "cos":
		case "tan":
		case "!":
		case "ln":
		case "log":
		case "%":
		case "√":
			return 3;
		}
		return -1;
	}

	/*
	 * transfer from infex to postfix
	 */
	public static String infexToPostFix(String infix) {
		String postfix = "";
		String[] s = infix.split(" ");
		for (int i = 0; i < s.length; i++) {
			if (priority_order(s[i]) > 0) {
				while (!stack.isEmpty() && priority_order((String) stack.peek().getData()) >= priority_order(s[i])) {
					postfix += stack.pop().getData() + " ";
				}
				stack.push(s[i]);
			} else if (s[i].equals("(")) {
				stack.push(s[i]);
			} else if (s[i].equals(")")) {
				String x = (String) stack.pop().getData();
				while (!x.equals("(")) {
					postfix += x + " ";
					x = (String) stack.pop().getData();
				}
			} else {
				postfix += s[i] + " ";
			}
		}
		while (!stack.isEmpty()) {
			postfix += stack.pop().getData() + " ";
		}
		return postfix;
	}

	/*
	 * transfer from postfix to evatuation display the result on the stage by the
	 * code algorithm
	 */
	public String postFixedToEvaluiton(String postfix) {
		String[] SR = postfix.split(" ");
		for (int i = 0; i < SR.length; i++) {
			double result = 0;
			if (SR[i].equals("+")) {
				result = Double.parseDouble((String) stack.pop().getData())
						+ Double.parseDouble((String) stack.pop().getData());
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("-")) {
				result = -Double.parseDouble((String) stack.pop().getData())
						+ Double.parseDouble((String) stack.pop().getData());
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("×")) {
				result = Double.parseDouble((String) stack.pop().getData())
						* Double.parseDouble((String) stack.pop().getData());
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("÷")) {
				double d = Double.parseDouble((String) stack.pop().getData());
				result = Double.parseDouble((String) stack.pop().getData()) / d;
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("%")) {
				result = Double.parseDouble((String) stack.pop().getData()) / 100;
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("!")) {
				result = factorial(Double.parseDouble((String) stack.pop().getData()));
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("sin")) {
				result = Math.sin((Double.parseDouble((String) stack.pop().getData())));
				stack.push(String.format("%.9f", result) + " ");
			} else if (SR[i].equals("cos")) {
				result = Math.cos((Double.parseDouble((String) stack.pop().getData())));
				stack.push(String.format("%.9f", result) + " ");
			} else if (SR[i].equals("tan")) {
				result = Math.tan((Double.parseDouble((String) stack.pop().getData())));
				stack.push(String.format("%.9f", result) + " ");
			} else if (SR[i].equals("ln")) {
				result = Math.log((Double.parseDouble((String) stack.pop().getData())));
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("log")) {
				result = Math.log10((Double.parseDouble((String) stack.pop().getData())));
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("^")) {
				double d = Double.parseDouble((String) stack.pop().getData());
				result = Math.pow(Double.parseDouble((String) stack.pop().getData()), d);
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("π")) {
				result = Math.PI;
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("e")) {
				result = Math.E;
				stack.push(String.valueOf(result) + " ");
			} else if (SR[i].equals("√")) {
				result = Math.sqrt(Double.parseDouble((String) stack.pop().getData()));
				stack.push(String.valueOf(result) + " ");
			} else {
				stack.push(SR[i]);
			}
		}
		return (String) stack.pop().getData();
	}

	/*
	 * the factorial method to calculate the factorial for any number
	 */
	public static long factorial(double n) {
		double fact = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			return (long) fact;
		}
	}

}
