public class Data {
    private static final String VALID_CHARACTERS = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM1234567890_";
    private Data() {
    }

    public static boolean valid(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!valid(login)) {
            throw new WrongLoginException("Invalid login!");
        }
        if (!valid(password)) {
            throw new WrongPasswordException("Invalid password!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords don't match!");
        }
    }
    private static boolean valid(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}

