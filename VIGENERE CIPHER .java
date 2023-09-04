import java.util.*; 
class vigenereCipher
{ 
static String encode(String text, final String key) 
{ 
String res = ""; text = text.toUpperCase(); 
for (int i = 0, j = 0; i<text.length(); i++) 
{ 		
char c = text.charAt(i); 
if (c < 'A' || c > 'Z') 
{ 
continue;
} 
res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
j = ++j % key.length(); 
} 
return res;
}
static String decode(String text, final String key) 
{ 
String res = ""; 
text = text.toUpperCase(); 
for (int i = 0, j = 0; i<text.length(); i++) 

{ 
char c = text.charAt(i); if (c < 'A' || c > 'Z') 
{
 continue; 
} 
res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
 j = ++j % key.length(); 
}
 return res;
}
public static void main (String[] args) throws java.lang.Exception
{ 
String key = "VIGENERECIPHER"; 
String msg = "SecurityLaboratory"; 
System.out.println("simulation of Vigenere Cipher"); 
System.out.println("input message   : " + msg); 
String enc = encode(msg, key); 
System.out.println("encoded message : " + enc); 
System.out.println("decoded message : " + decode(enc, key)); 
}
}

//stdin: 
//Standard input is empty 
//stdout: 
//simulation of Vigenere Cipher
//input message  	 : SecurityLaboratory
//encoded message 	: NMIYEMKCNIQVVROWXC 
//decoded message	: SECURITYLABORATORY 
