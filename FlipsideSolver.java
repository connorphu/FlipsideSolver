/*
*Connor Phu
*11/27/15
*FlipsideSolver class implements an application
*for users to input their puzzle and solve.
*/

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.List;

public class FlipsideSolver extends JFrame
{
   private JLabel solverLabel, nameLabel;
   private JButton newPuzzleButton, solvePuzzleButton, randomPuzzleButton;
   private JButton[] buttonArray;
   private JOptionPane userPuzzleInput;
   private HashSet<String> duplicates = new HashSet<String>();
   private String[] temp = new String[3];
   
   public FlipsideSolver() //create frame for the puzzle.
   {
      this.setTitle("Flipside Solver");
      this.setSize(300,175);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setUpComponents();
   }
   
   public void showMe() //set frame visible.
   {
      this.setVisible(true);   
   }
   
   public void setUpComponents() //populates the frame.
   {
      JPanel top = new JPanel();    //dividing the frame in thirds.
      JPanel middle = new JPanel();
      JPanel bottom = new JPanel();
      
      JPanel userPuzzle = new JPanel(); //where user puzzle located.
      JPanel buttonPane = new JPanel(); //where buttons for user located.
      
      JLabel solverLabel = new JLabel ("Flipside Solver"); //labeling the frame.
      JLabel nameLabel = new JLabel("By: Connor Phu");     
      
      JButton newPuzzleButton = new JButton("New");       //creating buttons.
      JButton solvePuzzleButton = new JButton("Solve");
      JButton randomPuzzleButton = new JButton("Random");
      
      top.setLayout(new GridLayout(2,1));        //setting up layouts
      buttonPane.setLayout(new GridLayout(1,3));
      userPuzzle.setLayout(new GridLayout(2,5));
      
      top.add(solverLabel);      //adding labels to top 3rd.
      top.add(nameLabel);
      nameLabel.setHorizontalAlignment( SwingConstants.CENTER);
      solverLabel.setHorizontalAlignment( SwingConstants.CENTER);
      
      middle.add(userPuzzle);    //adding the puzzle to middle third.
      userPuzzle.setPreferredSize(new Dimension(250,60));
      
      buttonPane.add(newPuzzleButton);    //adding buttons to lower third.
      buttonPane.add(solvePuzzleButton);
      buttonPane.add(randomPuzzleButton);
      bottom.add(buttonPane);
      
      add(top,BorderLayout.NORTH);     //adding the panels to the frame.
      add(middle,BorderLayout.CENTER);
      add(bottom,BorderLayout.SOUTH);
      
      buttonArray = new JButton[10];   //creating 10 buttons for user input and 
      for(int i=0;i<10;i++)            //setting them to blank.
      {
         buttonArray[i] = new JButton("");
      }
      for(int i=0;i<10;i++)   //adding each button to the middle panel.
      {
         userPuzzle.add(buttonArray[i]);
      }
      
      //button at index 0 of the array
      buttonArray[0].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {  
            //allow user input when clicked.
            String i0 = JOptionPane.showInputDialog("Enter a number 0-9");
            //check for user input if it is between 0 and 9.
            if(Integer.parseInt(i0) >= 0 && Integer.parseInt(i0) <= 9)
            {
               //check for duplicates from user input.
               if(duplicates.add(i0) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               //if there's no duplicates then set the button at that index to the input.
               else
               {
                  buttonArray[0].setText(i0);
               }
            }
            else
            {
               //if input is not between 0-9 then error message popped up.
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 1 of the array (everything is same as button 0).
      buttonArray[1].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i1 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i1) >= 0 && Integer.parseInt(i1) <= 9)
            {
               if(duplicates.add(i1) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[1].setText(i1);
               }
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 2 of the array (everything is same as button 0).
      buttonArray[2].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i2 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i2) >= 0 && Integer.parseInt(i2) <= 9)
            {
               if(duplicates.add(i2) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[2].setText(i2);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 3 of the array (everything is same as button 0).
      buttonArray[3].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i3 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i3) >= 0 && Integer.parseInt(i3) <= 9)
            {
               if(duplicates.add(i3) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[3].setText(i3);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 4 of the array (everything is same as button 0).
      buttonArray[4].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i4 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i4) >= 0 && Integer.parseInt(i4) <= 9)
            {
               if(duplicates.add(i4) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[4].setText(i4);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 5 of the array (everything is same as button 0).
      buttonArray[5].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i5 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i5) >= 0 && Integer.parseInt(i5) <= 9)
            {
               if(duplicates.add(i5) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[5].setText(i5);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 6 of the array (everything is same as button 0).
      buttonArray[6].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i6 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i6) >= 0 && Integer.parseInt(i6) <= 9)
            {
               if(duplicates.add(i6) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[6].setText(i6);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 7 of the array (everything is same as button 0).
      buttonArray[7].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i7 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i7) >= 0 && Integer.parseInt(i7) <= 9)
            {
               if(duplicates.add(i7) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[7].setText(i7);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 8 of the array (everything is same as button 0).
      buttonArray[8].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i8 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i8) >= 0 && Integer.parseInt(i8) <= 9)
            {
               if(duplicates.add(i8) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[8].setText(i8);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //button at index 9 of the array (everything is same as button 0).
      buttonArray[9].addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String i9 = JOptionPane.showInputDialog("Enter a number 0-9");
            if(Integer.parseInt(i9) >= 0 && Integer.parseInt(i9) <= 9)
            {
               if(duplicates.add(i9) == false)
               {
                  JOptionPane.showMessageDialog(null, "Duplicate found");
               }
               else
               {
                  buttonArray[9].setText(i9);
               }
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Invalid input");
            }
         }
      });
      
      //New button.
      //reset all buttons to blank when clicked.
      newPuzzleButton.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            //reset all button to empty and clear the duplicates HashSet.
            for(int i=0;i<buttonArray.length;i++)
            {
               buttonArray[i].setText("");
               duplicates.clear();
            }
         }
      });
      
      //Solve button.
      //solves the puzzle when clicked.
      solvePuzzleButton.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            duplicates.clear(); //clear the duplicates HashSet.
            
            //check all buttons to make sure there's no duplicates or empty.
            for(int i=0;i<buttonArray.length;i++)
            {
                if(duplicates.add(buttonArray[i].getText()) == false || buttonArray[i].getText() == "")
                {
                  JOptionPane.showMessageDialog(null, "Invalid puzzle");
                }
            }
            
            //starting a new thread so the puzzle can be seen being solved.
            Thread solve = new Thread(new Runnable() 
            {
               public void run()
               {
                  //disable buttons so user can't mess with them.
                  for(int i=0;i<buttonArray.length;i++)
                  {
                     buttonArray[i].setEnabled(false);
                  }
                  
                  newPuzzleButton.setEnabled(false);
                  solvePuzzleButton.setEnabled(false);
                  randomPuzzleButton.setEnabled(false);
                  
                  //solve for '0' in the puzzle first.
                  //check where '0' is at and use the correct
                  //permutations to get '0' to index 0 of the array.
                  //we don't have to check if '0' is in index 0 because then it's solved.
                  if(checkPosition(0) == 1)
                  {
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(0) == 2)
                  {
                     delay();
                     permuteLR();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(0) == 3)
                  {
                     delay();
                     permuteLR();
                     delay();
                     permuteRM();
                  }
                  else if(checkPosition(0) == 4)
                  {
                     delay();
                     permuteLR();
                     delay();
                     permuteRL();               
                  }
                  else if(checkPosition(0) == 5)
                  {
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(0) == 6)
                  {
                     delay();
                     permuteRM();
                  }
                  else if(checkPosition(0) == 7)
                  {
                     delay();
                     permuteRL();
                  }
                  else if(checkPosition(0) == 8)
                  {
                     delay();
                     permuteRL();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(0) == 9)
                  {
                     delay();
                     permuteRL();
                     delay();
                     permuteLR();
                     delay();
                     permuteRR();
                  }
            
                  //solve for '5' in the puzzle second.
                  //check where '5' is at and use the correct
                  //permutations to get '5' to index 5 of the array.
                  //we don't have to check index 0 or 5 because '0' was solved
                  //first and will be in index 0 and if '5' is in index 5 then it's solved.
                  if(checkPosition(5) == 1)
                  {
                     delay();
                     permuteMR();
                  }
                  else if(checkPosition(5) == 2)
                  {
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 3)
                  {
                     delay();
                     permuteLR();
                     delay();
                     permuteLM();
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 4)
                  {
                     delay();
                     permuteLR();
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 6)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 7)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 8)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                     delay();
                     permuteLM();
                     delay();
                     permuteLR();
                  }
                  else if(checkPosition(5) == 9)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                  }
            
                  //solve for '1' in the puzzle third.
                  //check where '1' is at and use the correct
                  //permutations to get '1' to index 1 of the array.
                  //we don't have to check index 0,5 or 1 because '0' and '5' were solved
                  //and will be in index 0,5 respectively and if '1' is in index 1 then it's solved.
                  if(checkPosition(1) == 2)
                  {
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(1) == 3)
                  {
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(1) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(1) == 6)
                  {
                     delay();
                     permuteMM();
                  }
                  else if(checkPosition(1) == 7)
                  {
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(1) == 8)
                  {
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(1) == 9)
                  {
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  
                  //solve for '6' in the puzzle fourth.
                  //check where '6' is at and use the correct
                  //permutations to get '6' to index 6 of the array.
                  //we don't have to check index 0,1,5 or 6 because '0','1', and '5' were solved
                  //and will be in index 0,1,5 respectively and if '6' is in index 6 then it's solved.
                  if(checkPosition(6) == 2)
                  {
                     delay();
                     permuteLM();
                  }
                  else if(checkPosition(6) == 3)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                  }
                  else if(checkPosition(6) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                  }
                  else if(checkPosition(6) == 7)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                  }
                  else if(checkPosition(6) == 8)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                  }
                  else if(checkPosition(6) == 9)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                     delay();
                     permuteLL();
                     delay();
                     permuteLM();
                  }
                  
                  //solve for '2' in the puzzle fifth.
                  //check where '2' is at and use the correct
                  //permutations to get '2' to index 2 of the array.
                  //we don't have to check index 0,1,5,6 or 2 because '0','1','5' and '6' were solved
                  //and will be in index 0,1,5,6 respectively and if '2' is in index 2 then it's solved.
                  if(checkPosition(2) == 3)
                  {
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                  }
                  else if(checkPosition(2) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteRR();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                  }
                  else if(checkPosition(2) == 7)
                  {
                     delay();
                     permuteLL();
                  }
                  else if(checkPosition(2) == 8)
                  {
                     delay();
                     permuteRR();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                  }
                  else if(checkPosition(2) == 9)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteRR();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                  }
                  
                  //solve for '7' in the puzzle sixth.
                  //check where '7' is at and use the correct
                  //permutations to get '7' to index 7 of the array.
                  //we don't have to check index 0,1,2,5,6 or 7 because '0','1','2','5' and '6' were solved
                  //and will be in index 0,1,2,5,6 respectively and if '7' is in index 7 then it's solved.
                  if(checkPosition(7) == 3)
                  {
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteRR();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(7) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(7) == 8)
                  {
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteRR();
                  }
                  else if(checkPosition(7) == 9)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteMR();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                     delay();
                     permuteRR();
                  }
                  
                  //solve for '3' in the puzzle seventh.
                  //check where '3' is at and use the correct
                  //permutations to get '3' to index 3 of the array.
                  //we don't have to check index 0,1,2,5,6,7 or 3 because '0','1','2','5','6' and '7' were solved
                  //and will be in index 0,1,2,5,6,7 respectively and if '3' is in index 3 then it's solved.
                  if(checkPosition(3) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  else if(checkPosition(3) == 8)
                  {
                     delay();
                     permuteMR();
                     delay();
                     permuteLR();
                     delay();
                     permuteMR();
                     delay();
                     permuteMM();
                  }
                  else if(checkPosition(3) == 9)
                  {
                     delay();
                     permuteMM();
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                  }
                  
                  //solve for '8' in the puzzle seventh.
                  //check where '8' is at and use the correct
                  //permutations to get '8' to index 8 of the array.
                  //we don't have to check index 0,1,2,3,5,6,7 or 8 because '0','1','2','3','5','6' and '7' were solved
                  //and will be in index 0,1,2,3,5,6,7 respectively and if '8' is in index 8 then it's solved.
                  if(checkPosition(8) == 4)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                  }
                  else if(checkPosition(8) == 9)
                  {
                     delay();
                     permuteLM();
                     delay();
                     permuteMM();
                     delay();
                     permuteML();
                     delay();
                     permuteMM();
                  }
                  
                  //solve for '4' in the puzzle last.
                  //we don't have to check index 0,1,2,3,5,6,7 or 8 because '0','1','2','5','6','7' and '8' were solved
                  //and will be in index 0,1,2,5,6,7 respectively and if '4' is in index 4 then the whole puzzle is solved.
                  //there's only two spots left, index 4 and 9.
                  //if  '4' is in index 4 then '9' has to be in index 9 since it's the last spot.
                  //use these permutations to switch '4' and '9' to the correct indices.
                  if(checkPosition(4) == 9)
                  {
                     delay();
                     permuteLL();
                     delay();
                     permuteLR();
                     delay();
                     permuteLL();
                     delay();
                     permuteRL();
                     delay();
                     permuteLL();
                     delay();
                     permuteMR();
                     delay();
                     permuteMM();
                     delay();
                     permuteRR();
                     delay();
                     permuteRM();
                  }
                  
                  //reenable buttons ready for user input.
                  for(int i=0;i<buttonArray.length;i++)
                  {
                     buttonArray[i].setEnabled(true);
                  }
                  
                  newPuzzleButton.setEnabled(true);
                  solvePuzzleButton.setEnabled(true);
                  randomPuzzleButton.setEnabled(true);  
               }
            });  
            solve.start(); 
                        
            //clear duplicates HashSet
            duplicates.clear();
         }
      });
      
      //Random button.
      //populates buttons and scamble them in random order when clicked.
      randomPuzzleButton.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            //creates new arrayList and populates it from 0-9.
            List<String> list = new ArrayList<String>();
            for(int i=0;i<buttonArray.length;i++)
            {
               list.add(Integer.toString(i));
            }
            
            //scrambles the array list.
            Collections.shuffle(list);
            
            //taking the scrambled arrayList and populating the buttons.
            for(int i=0;i<buttonArray.length;i++)
            {
               buttonArray[i].setText(list.get(i));
            }
         }
      });
   }
   
   //permutes the puzzle (flip the flip area in the puzzle).
   //(the first letter represents the top slider, the second letter represents the bottom slider)
   //permutes with both the top slider and bottom slider of the puzzle
   //all the way to the left.
   public void permuteLL()
   {
      for(int i=2;i<=4;i++)
      {
         //take values from index 2-4 in buttonArray and place them in temp in index 0-2.
         temp[i-2] = buttonArray[i].getText();
         //change values of index 2-4 in buttonArray to values from index 7-9 in buttonArray.
         buttonArray[i].setText(buttonArray[i+5].getText());
      }
      for(int i=7;i<=9;i++)
      {
         //change values of index 7-9 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-7]);
      }
      //effectively swapping values from index 2-4 with index 7-9 respectively.
   }
   
   //permutes with top slider all the way left
   //and the bottom slider in the middle.
   public void permuteLM()
   {
      for(int i=2;i<=4;i++)
      {
         //take values from index 2-4 in buttonArray and place them in temp in index 0-2.
         temp[i-2] = buttonArray[i].getText();
         //change values of index 2-4 in buttonArray to values from index 6-8 in buttonArray.
         buttonArray[i].setText(buttonArray[i+4].getText());
      }
      for(int i=6;i<=8;i++)
      {
         //change values of index 6-8 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-6]);
      }
      //values from index 2-4 and index 6-8 have been swapped respectively.
   }
   
   //permutes with top slider all the way left
   //and the bottom slider all the way right.
   public void permuteLR()
   {
      for(int i=2;i<=4;i++)
      {
         //take values from index 2-4 in buttonArray and place them in temp in index 0-2.
         temp[i-2] = buttonArray[i].getText();
         //change values of index 2-4 in buttonArray to values from index 5-7 in buttonArray.
         buttonArray[i].setText(buttonArray[i+3].getText());
      }
      for(int i=5;i<=7;i++)
      {
         //change values of index 5-7 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-5]);
      }
      //values from index 2-4 and index 5-7 have been swapped respectively.
   }
   
   //permutes with top slider in the middle
   //and the bottom slider all the way left.
   public void permuteML()
   {
      for(int i=1;i<=3;i++)
      {
         //take values from index 1-3 in buttonArray and place them in temp in index 0-2.
         temp[i-1] = buttonArray[i].getText();
         //change values of index 1-3 in buttonArray to values from index 7-9 in buttonArray.
         buttonArray[i].setText(buttonArray[i+6].getText());
      }
      for(int i=7;i<=9;i++)
      {
         //change values of index 7-9 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-7]);
      }
      //values from index 1-3 and index 7-9 have been swapped respectively.
   }
   
   //permutes with both top slider and the bottom slider in the middle.
   public void permuteMM()
   {
      for(int i=1;i<=3;i++)
      {
         //take values from index 1-3 in buttonArray and place them in temp in index 0-2.
         temp[i-1] = buttonArray[i].getText();
         //change values of index 1-3 in buttonArray to values from index 6-8 in buttonArray.
         buttonArray[i].setText(buttonArray[i+5].getText());
      }
      for(int i=6;i<=8;i++)
      {
         //change values of index 6-8 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-6]);
      }
      //values from index 1-3 and index 6-8 have been swapped respectively.
   }
   
   //permutes with top slider in the middle
   //and the bottom slider all the way right.  
   public void permuteMR()
   {
      for(int i=1;i<=3;i++)
      {
         //take values from index 1-3 in buttonArray and place them in temp in index 0-2.
         temp[i-1] = buttonArray[i].getText();
         //change values of index 1-3 in buttonArray to values from index 5-7 in buttonArray.
         buttonArray[i].setText(buttonArray[i+4].getText());
      }
      for(int i=5;i<=7;i++)
      {
         //change values of index 5-7 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-5]);
      }
      //values from index 1-3 and index 5-7 have been swapped respectively.
   }
   
   //permutes with top slider all the way right
   //and the bottom slider all the way left.
   public void permuteRL()
   {
      for(int i=0;i<=2;i++)
      {
         //take values from index 0-2 in buttonArray and place them in temp in index 0-2.
         temp[i] = buttonArray[i].getText();
         //change values of index 0-2 in buttonArray to values from index 7-9 in buttonArray.
         buttonArray[i].setText(buttonArray[i+7].getText());
      }
      for(int i=7;i<=9;i++)
      {
         //change values of index 7-9 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-7]);
      }
      //values from index 0-2 and index 7-9 have been swapped respectively.
   }
   
   //permutes with top slider all the way right.
   //and the bottom slider in the middle.
   public void permuteRM()
   {
      for(int i=0;i<=2;i++)
      {
         //take values from index 0-2 in buttonArray and place them in temp in index 0-2.
         temp[i] = buttonArray[i].getText();
         //change values of index 0-2 in buttonArray to values from index 6-8 in buttonArray
         buttonArray[i].setText(buttonArray[i+6].getText());
      }
      for(int i=6;i<=8;i++)
      {
         //change values of index 6-8 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-6]);
      }
      //values from index 0-2 and index 6-8 have been swapped respectively.
   }
   
   //permutes with both top slider and the bottom slider all the way right.
   public void permuteRR()
   {
      for(int i=0;i<=2;i++)
      {
         //take values from index 0-2 in buttonArray and place them in temp in index 0-2.
         temp[i] = buttonArray[i].getText();
         //change values of index 0-2 in buttonArray to values from index 5-7 in buttonArray
         buttonArray[i].setText(buttonArray[i+5].getText());
      }
      for(int i=5;i<=7;i++)
      {
         //change values of index 5-7 in buttonArray to values from temp.
         buttonArray[i].setText(temp[i-5]);
      }
      //values from index 0-2 and index 5-7 have been swapped respectively.
   }
   
   //check the position of the wanted value.
   public int checkPosition(int x)
   {
      int position = x;
      //look through the whole buttonArray for the value wanted.
      for(int i=0;i<buttonArray.length;i++)
      {
         //check the current index in buttonArray for the value wanted.
         if(Integer.parseInt(buttonArray[i].getText()) == x)
         {
            //if the current index has the value wanted, set the current index number to position.
            position = i;
         }
      }
      //return the position of where the wanted value is.
      return position;
      
   }
   
   //delay function to slow down each methods.
   public void delay()
   {
      try
      {
         Thread.sleep(500);
      }
      catch(InterruptedException ex)
      {
         Thread.currentThread().interrupt();
      }
   }
   
}