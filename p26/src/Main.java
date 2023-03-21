import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Solution.removeDuplicates(nums));
    }
}

class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) { // caso especial de array vazio
            return 0;
        }

        int k = 1; // variável para manter o índice do último elemento não duplicado

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) { // se encontrou um elemento não duplicado
                nums[k] = nums[i]; // sobrescreve o elemento duplicado com o não duplicado
                k++; // atualiza o índice do último elemento não duplicado
            }
        }

        return k; // retorna o novo tamanho do array
    }

}