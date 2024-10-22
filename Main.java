
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  //sol-1
  System.out.print("Enter weight in kg: ");
  double weight = input.nextDouble();
  System.out.print("Enter height in m: ");
  double height = input.nextDouble();
  double bmi = weight / (height * height);
  System.out.println("BMI: " + bmi);

  //sol-2
  System.out.print("Enter marks: ");
  double marks = input.nextDouble();
  System.out.println("Total Marks: " + (marks / 100) * 100 + "%");

  //sol-3
  System.out.print("Enter USD amount: ");
  double usd = input.nextDouble();
  double eur = usd * 0.85;
  System.out.println("USD to EUR: " + eur);

  input.nextLine();

  //sol-4
  System.out.print("Enter a string: ");
  String word = input.nextLine();
  int length = word.length();
  StringBuilder reversed = new StringBuilder(word).reverse();
  System.out.println("Length of the string: " + length);
  System.out.println("Reversed string: " + reversed.toString());

  //sol-5
  System.out.print("Enter a sentence: ");
  String sentence = input.nextLine();
  System.out.print("Enter the start index: ");
  int startIndex = input.nextInt();
  System.out.print("Enter the end index: ");
  int endIndex = input.nextInt();
  input.nextLine();
  String substring = sentence.substring(startIndex, endIndex);
  System.out.println("Extracted substring: " + substring);

  //sol-6
  System.out.print("Enter a sentence: ");
  String sentence2 = input.nextLine();
  System.out.print("Enter a keyword: ");
  String keyword = input.nextLine();
  if (sentence2.contains(keyword)) {
   System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
  } else {
   System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
  }

  //sol-7
  System.out.print("Enter a sentence: ");
  String sentence3 = input.nextLine();
  System.out.print("Enter the word to replace: ");
  String wordToReplace = input.nextLine();
  System.out.print("Enter the replacement word: ");
  String replacementWord = input.nextLine();
  String modifiedSentence = sentence3.replace(wordToReplace, replacementWord);
  System.out.println("Modified sentence: " + modifiedSentence);

  //sol-8
  System.out.print("Enter String 1: ");
  String string1 = input.nextLine();
  System.out.print("Enter String 2: ");
  String string2 = input.nextLine();

  if (string1.equalsIgnoreCase(string2)) {
   System.out.println("Strings are equal (ignoring case).");
  } else {
   System.out.println("Strings are not equal.");
  }


  input.close();
 }
}
