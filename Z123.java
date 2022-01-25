  import java.text.NumberFormat;
	   import javafx.application.Application;
	   import javafx.geometry.HPos;
	   import javafx.geometry.Insets;
	   import javafx.geometry.Pos;
	   import javafx.scene.Scene;
	   import javafx.scene.control.Button;
	   import javafx.scene.control.Label;
	   import javafx.scene.control.PasswordField;
	   import javafx.scene.control.TextField;
	   import javafx.scene.layout.GridPane;
	   import javafx.scene.layout.HBox;
	   import javafx.scene.layout.StackPane;
	   import javafx.scene.layout.VBox;
	   import javafx.scene.text.TextAlignment;
	   import javafx.stage.Stage;
	   import static sun.net.www.http.HttpClient.New;
	   public class Z123 extends Application {
	        Stage window;
	   	    Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7;
	       @Override
	       public void start(Stage primaryStage) {
	           window=primaryStage;
	           GridPane pane = new GridPane();
	           pane.setAlignment(Pos.CENTER);
	           pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	           pane.setHgap(5.5);
	       	
	           Label label1= new Label("Welcome to our car rental service");
	       	Label label2= new Label("\n");
	       	Label label3= new Label("Please Log In");
	       	Label label4= new Label("\n");
	           Label mail = new  Label("Enter Name or  Mail Address:");
	     	    TextField num1 = new TextField("");
	     	    Label pass = new  Label("Enter Password:");
	     	    PasswordField num2 = new PasswordField();
	       pane.add(label1 ,  1, 0);
	           pane.add(label2 ,  1, 1);
	           pane.add(label3 ,  1, 2);
	           pane.add(mail ,  0, 3);
	           pane.add(num1 ,  1, 3);
	           pane.add(pass ,  0, 4);
	           pane.add(num2 ,  1, 4);
	           pane.add(label4 ,  1, 6);
	   Button but1=new Button("LOG IN");
	         pane.add(but1, 1,  5);
	         but1.setOnAction(e ->window.setScene(scene2));
	         
	         Button but2=new Button(¡±Sign In");
	         pane.add(but2, 1, 7);
	         but2.setOnAction(e ->window.setScene(scene3));
	         scene1=new Scene(pane, 1360, 760);
	         //scene 2--
	         GridPane p = new GridPane();
	         p.setAlignment(Pos.CENTER);
	         p.setPadding(new Insets(5, 6.5, 7.5, 8.5));
	         p.setHgap(5.5); 
	           Label select = new  Label("PLease Select A Car Model");
	   	    Label gap1 = new  Label("\n");
	           Label model = new  Label("Car Model");
	   	    Label available = new  Label("Available And Rent for Per Hour");
	   	    Label myv = new  Label("1. MYV ");
	   	    TextField num3 = new TextField("5   (PH RM 7)");
	   	    Label proton = new  Label("2. PROTON SAGA ");
	   	    TextField num4 = new TextField("6   (PH RM 5)");
	   	    Label axia = new  Label("3. AXIA ");
	   	    TextField num5 = new TextField("7   (PH RM 6)");
	   	    Label city = new  Label("4. HONDA CITY ");
	   TextField num6 = new TextField("3   (PH RM 9)");
	   	    Label civic = new  Label("5. HONDA CIVIC ");
	   	    TextField num7 = new TextField("2   (PH RM 8)");
	   	    Label gap2 = new  Label("\n");
	   	    Label input = new  Label("Input A Model Name: ");
	   	    TextField num8 = new TextField("");
	   	    Label gap5 = new  Label("\n");
	   	    Label rent = new  Label("Input A Suitable Renting Hour");
	               Label gap6 = new  Label("\n");
	   	    Label hour = new  Label(" Hours");
	   	    TextField num14 = new TextField("");
	   	    Label day = new  Label(" Days");
	   	    TextField num15 = new TextField("");
	   	  p.add(select ,  1, 0);
	   	  p.add(gap1 ,  1, 1);
	         p.add(model ,  0, 2);
	         p.add(available ,  1, 2);
	         p.add(myv ,  0, 3);
	         p.add(num3 ,  1, 3);
	         p.add(proton ,  0, 4);
	         p.add(num4 ,  1, 4);
	         p.add(axia ,  0, 5);
	         p.add(num5 ,  1, 5);
	         p.add(city ,  0, 6);
	   p.add(num6 ,  1, 6);
	         p.add(civic ,  0, 7);
	         p.add(num7 ,  1, 7);
	         p.add(gap2 ,  1, 8);
	         p.add(input ,  0, 9);
	         p.add(num8 ,  1, 9);
	         p.add(gap5 ,  1, 10);
	         p.add(rent ,  1, 11);
	         p.add(gap6 ,  1, 12);
	          p.add(hour ,  0, 13);
	         p.add(num14 ,  1, 13);
	         p.add(day ,  0, 14);
	         p.add(num15 ,  1, 14);
	         Button but3=new Button("CONFIRM !!!");
	         p.add(but3, 1, 15);
	         but3.setOnAction(e ->window.setScene(scene4));
	         scene2=new Scene(p,1360, 760);
	         // scene 3--       
	         GridPane g = new GridPane();
	         g.setAlignment(Pos.CENTER);
	         g.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	         g.setHgap(5.5);
	   Label reg = new  Label("New Registration  ");
	   	    Label gap3 = new  Label("\n");
	   	    Label name = new  Label("Enter Name : ");
	   	    TextField num9 = new TextField("");
	   	    Label email = new  Label("Email Address :");
	   	    TextField num10 = new TextField("");
	   	    Label licence = new  Label("Driving Licence :");
	   	    TextField num11 = new TextField("");
	   	    Label expired = new  Label("Driving Licence expired date : ");
	   	    TextField num12 = new TextField("");
	   	    Label phone = new  Label("Phone no :");
	   	    TextField num13 = new TextField("");
	   	    Label gap4 = new  Label("\n");
	               g.add(reg ,  1, 0);
	   	      g.add(gap3 ,  1, 1);
	   	      g.add(name ,  0, 2);
	   	      g.add(num9 ,  1, 2);
	   	      g.add(email ,  0, 3);
	   	      g.add(num10 ,  1, 3);
	   	      g.add(licence ,  0, 4);
	   	      g.add(num11 ,  1, 4);
	   	      g.add(expired ,  0, 5);
	   	      g.add(num12 ,  1, 5);
	   	      g.add(phone ,  0, 6);
	   	      g.add(num13 ,  1, 6);
	   	      g.add(gap4 ,  1, 7);
	   	      g.add(but4, 1, 8);
	   	      but4.setOnAction(e ->window.setScene(scene1));
	   	      scene3=new Scene(g, 1360, 760);
	                  //Scene 4----
	   	      GridPane c = new GridPane();
	   	      c.setAlignment(Pos.CENTER);
	   	      c.setPadding(new Insets(5, 6.5, 7.5, 8.5));
	   	      c.setHgap(5.5); 
	   	        Label cost = new  Label("Total Cost");
	   	        Label gap7 = new  Label("\n");
	   	        Label name1 = new  Label(" Name : ");
	   		    TextField num16 = new TextField("");
	   		    Label car1 = new  Label(" Rented Car Model : ");
	   		    TextField num17 = new TextField("");
	   		    Label hour1 = new  Label(" Renting Hour : ");
	   		    TextField num18 = new TextField("");
	   		   Label calculate = new  Label(" Cost : ");
	   		    TextField num19 = new TextField("");
	   		    Label gap8 = new  Label("\n");
	   		    Label gap10 = new  Label("\n");
	   		    c.add(cost ,  1, 0);
	   		    c.add(gap7 ,  1, 1);
	   		    c.add(name1 ,  0, 2);
	   		    c.add(num16 ,  1, 2);
	   		    c.add(car1 ,  0, 3);
	   		    c.add(num17 ,  1, 3);
	   		    c.add(hour1 ,  0, 4);
	   		    c.add(num18 ,  1, 4);
	   		    c.add(calculate ,  0, 5);
	   		    c.add(num19 ,  1, 5);
	   		    c.add(gap8 ,  1, 9);
	                        c.add(gap10 ,  1, 7);
	   Button but5=new Button("Show Details");
	   		      c.add(but5, 1, 6);
	   		      but5.setOnAction(event -> {
	   				   
	   				   num16.setText(String.format(" "+  (num1.getText()))
	   			               );
	   				   num17.setText(String.format(" "+  (num8.getText()))
	   			               );
	   				   num18.setText(String.format(" "+  (Double.parseDouble(num14.getText())))
	   			               );
	   				  
	   				   
	   		      });
	                      Button but8=new Button("CONFIRM");
	   		      c.add(but8, 0, 8);
	   		      but8.setOnAction(e ->window.setScene(scene6));
	   		 
	   		      
	   		      Button but9=new Button("CANCEL ORDER");
	   		      c.add(but9, 1, 8);
	   		      but9.setOnAction(e ->window.setScene(scene2));
	   		     
	         
	         
	         
	   		      Button but6=new Button("HElP SEIVICE INFORMATION");
	   		      c.add(but6, 1, 10);
	   		      but6.set      GridPane h = new GridPane();
	   		      h.setAlignment(Pos.CENTER);
	   		      h.setPadding(new Insets(5, 6.5, 7.5, 8.5));
	   		      h.setHgap(5.5); 
	   		        Label help = new  Label("Contact With Us!!!");
	   		        Label gap9 = new  Label("\n");
	   		        Label phn = new  Label(" Phone no : ");
	   			    TextField num20 = new TextField("0171374034");
	   			    Label eml = new  Label(" Email : ");
	   			    TextField num21 = new TextField("protoncarrental004@gmail.com");
	         
	         
	   		        h.add(help ,  1, 0);
	   			    h.add(gap9 ,  1, 1);
	   			    h.add(phn ,  0, 2);
	   			    h.add(num20 ,  1, 2);
	   			    h.add(eml ,  0, 3);
	   			    h.add(num21 ,  1, 3);
	          Button but7=new Button("Back");
	   			      h.add(but7, 1, 7);
	   			      but7.setOnAction(e ->window.setScene(scene4));
	   			      scene5=new Scene(h, 1360, 760);
	   OnAction(e ->window.setScene(scene5));
	         GridPane s = new GridPane();
	   			      s.setAlignment(Pos.CENTER);
	   			      s.setPadding(new Insets(5, 6.5, 7.5, 8.5));
	   			      s.setHgap(5.5); 
	   			        Label congo = new  Label("Congratutalion!!!!");   
	   			        Label you = new  Label("You have rented a car Successfully!!!!"); 
	   			        Label gap11 = new  Label("\n");
	   			        Label gap12 = new  Label("\n");
	   			      
	   			      
	   			        s.add(congo ,  0, 1);
	   			        s.add(you ,  0, 2);
	   			        c.add(gap11 ,  0, 3);
	   			        c.add(gap12 ,  0, 4);
	   			        
	   			        
	   			        Button but11=new Button("Extend Time");
	   				      s.add(but11, 0, 5);
	   				      but11.setOnAction(e ->window.setScene(scene7)); 
	   			      
	   				      Button but12=new Button("Rent A New Car");
	   				      s.add(but12, 0, 6);
	   				      but12.setOnAction(e ->window.setScene(scene2)); 
	                                   Button but10=new Button("Log Out!");
	   				      s.add(but10, 0, 7);
	   				      but10.setOnAction(e ->window.close());
	   			      
	   			        scene6=new Scene(s, 1360, 760);
	              GridPane x = new GridPane();
	   				      x.setAlignment(Pos.CENTER);
	   				      x.setPadding(new Insets(5, 6.5, 7.5, 8.5));
	   				      x.setHgap(5.5); 
	   				        Label ex = new  Label("Time Extend!!!!");  
	   				        Label gap13 = new  Label("\n");
	   				        Label ext = new  Label(" Enter Extend Hour : ");
	   					    TextField num25 = new TextField("");
	   				        
	   				        x.add(ex ,  0, 1);
	   				        x.add(gap13,  0, 2);
	   				        x.add(ext ,  0, 3);
	   				        x.add(num25,  1, 3);
	   		      
	   		                                                      Button but13=new Button("Continue");
	   					      x.add(but13, 0, 4);
	   					      but13.setOnAction(e ->window.setScene(scene4)); 
	   					      scene7=new Scene(x, 1360, 760); 
	         
	         window.setScene(scene1);
	       window.setTitle(" Proton Car Rental Service");
	      window.show();
	             } /**
	        * @param args the command line arguments
	        */
	       public static void main(String[] args) {
	           launch(args);
	       }
	       }
