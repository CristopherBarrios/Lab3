/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3;

/**
 *
 * @author moyha
 */
public class Comparar implements Comparable<Comparar>{
    
    int n1;
    
    Comparar(int i){this.n1 = i;}
    
    public int compareTo(Comparar n){
        if(this.n1 > n.n1){
            return 1;
        }
        else if (this.n1 < n.n1){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public String toString(){
        return String.valueOf(this.n1);
    }
    
    public int get(){
        return this.n1;
    }
    
}
