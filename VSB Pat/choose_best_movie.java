// Single File Programming Question
// Lucy at the Film Festival

// LucarnosFilm Festival is an annual film festival and is also known for being a prestigious platform for art house films. 
// This time at the Lucarnos Film festival there are N movies screened, each of different genre ranging from drama movies to comedy ones and teen movies to horror ones. 
// Lucy is a huge fan of movies and visited the film festival, but she's not sure which movie she should watch.

// Each movie can be characterized by two integers Li and Ri, denoting the length and the rating of the corresponding movie. Lucy wants to watch exactly one movie with the maximal value of Li × Ri. 
// If there are several such movies, she would pick a one with the maximal Ri among them. If there is still a tie, she would pick the one with the minimal index among them.

// Write a program to help Lucy pick a movie to watch at the film festival.

// Input format :
// The first line of the input description contains an integer n. Assume that the maximum value for n as 50.

// The second line of the input description contains n integers L1, L2, ...,Ln.

// The following line contains n integers R1, R2, ...,Rn.

// Output format :
// Output a single integer i denoting the index of the movie that Lucy should watch in the film festival. Note that you follow 1-based indexing.

// Sample test cases :
// Input 1 :
// 2
// 1 2
// 2 1
// Output 1 :
// 1
// Input 2 :
// 4
// 2 1 4 1
// 2 4 1 4
// Output 2 :
// 2
// You are using Java
import java.util.*;
public class choose_best_movie{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] mov = new int[n];
        int[] rat = new int[n];
        for(int i =0; i<n;i++){
            mov[i]=s.nextInt();
        }
        for(int i =0; i<n;i++){
            rat[i]=s.nextInt();
        }
        int best_ind =-1,max_val= -1,max_rat=-1;
        for(int i =0; i<n;i++){
            int val = mov[i]*rat[i];
            if(val>max_val||(val==max_val && rat[i] >max_rat)){
                max_val = val;
                max_rat = rat[i];
                best_ind =i;
              }
            }
    System.out.print(best_ind+1);    
        
    }
}