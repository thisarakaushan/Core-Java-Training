/* Advanced Encryption Standard (AES) algorithm is a symmetric-key algorithm that uses the same key 
 * for both encryption and decryption of data.
 */

package mypackage.encrytion.decryption;

import java.io.File;

/**
 * A tester for the CryptoUtils class.
 * 
 * @author TK
 *
 */
public class CryptoUtilsTest {
    public static void main(String[] args) {
        String key = "Mary has one cat";
        File inputFile = new File("C:\\Users\\KIIT\\Documents\\1_hrc\\Product Platform\\Day_5\\document.txt");
        File encryptedFile = new File("C:\\Users\\KIIT\\Documents\\1_hrc\\Product Platform\\Day_5\\document.encrypted");
        File decryptedFile = new File("C:\\Users\\KIIT\\Documents\\1_hrc\\Product Platform\\Day_5\\document.decrypted");
         
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}