public class remove_tar_char{
    public static void main(String[] args) {
     String s="hello wogdds";
     String tar = "li";
     for(char a : tar.toCharArray()){
        s=s.replaceAll(String.valueOf(a), "");
     }
     System.out.println(s);
    }

}