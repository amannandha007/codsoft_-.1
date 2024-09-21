import javax.swing.*;

public class number_game
{
public static void main(String[] args) 
{
  int com_number=(int)(Math.random()*100+1);
  int userAnswer = 0;
  int count = 1;
  
  while(userAnswer!=com_number)
  {
    String res = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Game",3);
    userAnswer=Integer.parseInt(res);

    JOptionPane.showMessageDialog(null,""+determineGuess(userAnswer,com_number,count));
    count++;
  }
}
public static String determineGuess(int userAnswer,int com_number,int count)
{
    if(userAnswer<=0||userAnswer>100)
    {
        return "your guess is invaild";
    }
    else if(userAnswer==com_number)
    {
        return "correct!\n Total Guesses:"+count;
    }
    else if(userAnswer>com_number)
    {
        return "your guess is too high,try again.\nTry Number:"+count;
    }
    else if(userAnswer<com_number)
    {
        return "your guess is too low,try again.\nTry Number:"+count;
    }
    else
    {
        return "your guess is incorrect.\nTry Number:"+count;
    }
}
}