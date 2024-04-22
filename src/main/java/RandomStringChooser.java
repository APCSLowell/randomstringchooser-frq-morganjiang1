import java.util.;
public class RandomStringChooser{
private String[] stringChooser;
private boolean[] availability;

public RandomStringChooser(String [] wordArray){
availability = new boolean[wordArray.length];
stringChooser = wordArray;
for(int i = 0; i < availability.length; i++)
availability[i]  = true;
}

public String getNext(){
if (wordArray.length < 1)
{
  return "NONE";
}
int randomIndex = (int)(Math.random() * availability.length);
if(availability[randomIndex]){
availability[randomIndex] = false;
return stringChooser[randomIndex];
}
return "NONE";
}
}
