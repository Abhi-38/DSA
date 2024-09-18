package com.abhi.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SlotScore {
	public static int slotScore(String original, String guess) {
        int perfectHits = 0;
        int pseudoHits = 0;

        // Step 1: Identify and count perfect hits
        boolean[] matchedOriginal = new boolean[4];
        boolean[] matchedGuess = new boolean[4];
        
        for (int i = 0; i < 4; i++) {
            if (original.charAt(i) == guess.charAt(i)) {
                perfectHits += 2;
                matchedOriginal[i] = true;
                matchedGuess[i] = true;
            }//if
        }//for

        // Step 2: Identify and count pseudo hits
        for (int i = 0; i < 4; i++) {
            if (!matchedGuess[i]) { // Skip already matched slots
                for (int j = 0; j < 4; j++) {
                    if (!matchedOriginal[j] && guess.charAt(i) == original.charAt(j)) {
                        pseudoHits += 1;
                        matchedOriginal[j] = true;
                        break;
                    }
                }
            }
        }

        return perfectHits + pseudoHits;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String original = br.readLine();
            String guess = br.readLine();
            System.out.println(slotScore(original, guess));
        }
    }
}
