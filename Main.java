
    public class Main {
        public static void main(String[] args) {

            MyArrayList<Integer> list = new MyArrayList<>();
            for(int i = 0; i < 11; ++i){
                list.add(i);
            }

            System.out.println("list = " + list);
            list.add(2, 11);


            System.out.println("list = " + list);
            MyArrayList<Integer> list1 = new MyArrayList<>();
            for(int i = 1; i < 3; ++i){
                list1.add(i);
            }

            System.out.println("list1 = " + list1);
            list.addAll(list1);
            System.out.println("list = " + list);


            System.out.println(list.remove(13));
            System.out.println("list = " + list);



            MyArrayList.sort(list, (x, y) -> Integer.compare(x, y));
            System.out.println(list);

            MyArrayList<Number> list2 = new MyArrayList<>(list);
            System.out.println(list2);
        }
    }

