public class ClassEuklides
{
       public static void main(String []agrs) throws java.lang.Exception{

            int variableA = 110;
            int variableB = 22;

            if (variableA==variableB){
                System.out.println("Numbers are the same. Greatest Common Divisor is equal "+ variableA);
            }else{
                while(variableA>0&&variableB>0&&variableA!=variableB){
                    if (variableA>variableB){
                        variableA-=variableB;
                    }else{
                        variableB-=variableA;
                    }
                    if(variableA==variableB){
                        System.out.println("Greatest Common Divisor is equal " + variableA);
                    }
                }
            }
        }

}
