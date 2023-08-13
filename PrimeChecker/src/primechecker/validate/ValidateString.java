package primechecker.validate;

public class ValidateString {
    
    public ValidateString(){}
    //Validate the String for:
    //1.If it is null
    //2.if it is not a null
    //3.
    public static Boolean validateStr(String numbers){
         String[] str = numbers.split(" ");
        if (numbers==""){
            return false;
        }
        else{
            for (int i=0; i<str.length; i++){
                    if(!str[i].matches("[0-9]+")){
                        return false;
                    }
                }
              return true;
        }
    }
    
}
