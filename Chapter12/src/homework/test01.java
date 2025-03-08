package homework;

public class test01 {
    public static void main(String[] args) {

        class EcmDef {
            static void cal(String[] args) {
                if (args.length != 2) {
                    throw new ArrayIndexOutOfBoundsException("not enough args");
                } else {
                    try {
                        int a = Integer.parseInt(args[0]);
                        int b = Integer.parseInt(args[1]);
                        System.out.println(a / b);
                    } catch (ArrayIndexOutOfBoundsException e) {

                        System.out.println(e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());

                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        return;
                    }
                }
            }
        }
        String[] argsStrings = new String[2];
        argsStrings[0] = "6";
        argsStrings[1] = "3";
        EcmDef.cal(argsStrings);

    }
}