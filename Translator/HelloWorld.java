public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        String ar = "a,b,c,d";
        String words[]=ar.split(",");
        StringBuffer buf = new StringBuffer();
        
		for( int i=0;i<words.length;i++){
		    System.out.println("String " + words[i]);
            //buf.append( words[i]);   
		}
     }
}