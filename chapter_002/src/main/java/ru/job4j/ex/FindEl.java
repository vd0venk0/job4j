package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int index = -1;
        int i = -1;
        for (String s:value) {
            i++;
            if (s.equals(key)) {
                break;
            } else {
                System.out.println(i);
                throw new ElementNotFoundException("Element not found");
            }
        }
        return i;
    }

    public static void main(String[] args) {

        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        String element = new String("Spring");
        try {
            System.out.println(indexOf(seasons, element));
        } catch(ElementNotFoundException e) {
            e.printStackTrace();
        }
    }


}

