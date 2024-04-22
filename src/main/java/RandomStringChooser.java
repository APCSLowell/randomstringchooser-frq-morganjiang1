import java.util.*;
public class RandomStringChooser{
private ArrayList<String> stringChooser;

public RandomStringChooser(String [] wordArray){
stringChooser = new ArrayList<String>();
for (int i = 0; i < wordArray.length; i++)
{
  stringChooser.add(wordArray[i]);
}
}

public String getNext(){
if (stringChooser.length < 1)
{
  return "NONE";
}
int randomIndex = (int)(Math.random() * stringChooser.length);
return stringChooser.remove(randomIndex);
}
}
