package CognizantQuestIOns;
    public class lArgestinthreee {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                // This will throw ArrayIndexOutOfBoundsException
                System.out.println(numbers[5]);

                // This code will not be executed because of the exception above
                String s = null;
                System.out.println(s.length());
            }
            // First catch: handles ArrayIndexOutOfBoundsException
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
            // Second catch: handles NullPointerException
            catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
            // This block won't be executed because the first catch is already triggered
            catch (Exception e) {
                System.out.println("Generic Exception caught: " + e.getMessage());
            }
            finally {
                System.out.println("Finally block executed.");
            }
        }
    }
