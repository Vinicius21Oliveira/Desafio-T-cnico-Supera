package principal;

public class ResistorColorCode {
	
	private final ColorMapping colorMapping;


    public ResistorColorCode() {
        this.colorMapping = new ColorMapping();
    }

    public String calculateColorCode(String ohmsValue) {
        

        String value = ohmsValue.replace(" ohms", "");

        double numericValue;
        if (value.contains("k")) {
            numericValue = Double.parseDouble(value.replace("k", "")) * 1000;
        } else if (value.contains("M")) {
            numericValue = Double.parseDouble(value.replace("M", "")) * 1000000;
        } else {
            numericValue = Double.parseDouble(value);
        }

        String strValue = String.valueOf((int)numericValue);


        char firstDigit = strValue.charAt(0);
        char secondDigit = strValue.charAt(1);
        int multiplier = strValue.length() - 2;

        if (multiplier < 0) {
            multiplier = 0;
        }

        String firstColor = colorMapping.getColor(firstDigit);
        String secondColor = colorMapping.getColor(secondDigit);
        String multiplierColor = colorMapping.getColor((char)(multiplier + '0'));

        return firstColor + " " + secondColor + " " + multiplierColor + " dourado";
    }
}
