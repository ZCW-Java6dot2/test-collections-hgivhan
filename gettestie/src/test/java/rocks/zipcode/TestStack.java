package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

// So 12 Test in all, make sure you use the methods
// that most commonly describe why the data structure exists;
// e.g. for Stack be sure to use pop, push, peek and isEmpty.

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testStack2(){
        Stack<String> stack = new Stack<>();
        assertEquals(true, stack.isEmpty());
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty());
        stack.peek();
        assertEquals("Hello world", stack.peek());
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testHashSet(){
        HashSet<String> set = new HashSet();
        assertEquals(true, set.isEmpty());
        set.add();
        assertEquals(true, set.add("Hello"));
        set.contains();
        assertEquals(true, set.contains("Hello"));
        set.remove("Hello");
        assertEquals(true, set.isEmpty());
        set.add("Hello");
        set.add("world");
        assertEquals(2, set.size());
    }

    @Test
    public void testArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(true, list.isEmpty());
        list.add(12);
        assertEquals(true, list.contains(12));
        list.remove(12);
        assertEquals(list.isEmpty());
        list.add(13);
        list.add(14);
        assertEquals(2, list.size());
    }

    @Test
    public void testHashMap1(){
        Map <String, String> map = new HashMap<>();
        assertEquals(true, map.isEmpty());
        map.put("Java", "is lava");
        assertEquals(true, map.containsKey("Java"));
        assertEquals(true, map.containsValue("is lava"));
        map.remove("Java", "is lava");
        assertEquals(true, map.isEmpty());
        map.put("It's a", "marathon");
        map.replace("Its a", "journey");
        assertEquals(true, map.containsValue("journey"));
        map.put("Java", "is lava");
        assertEquals(2, map.size());
    }

    @Test
    public void testLinkedList(){
        List<String> list = new LinkedList<>();
        list.add("hello");
        assertEquals(true, list.contains("hello"));
        list.add("world");
        assertEquals ("hello", list.peek());
        list.pop();
        assertEquals(true, list.contains("world"));
        assertEquals(1, list.size());
        list.remove(0);
        assertEquals(false, list.contains("world"));

    }

    @Test
    public void testArrayDeque(){
        ArrayDeque<Integer>dq = new ArrayDeque<>();
        dq.add(12);
        dq.addFirst(13);
        assertEquals(13, dq.getFirst());
        dq.addLast(11);
        assertEquals(11, dq.getLast());
        assertEquals(false, dq.contains(7));
        assertEquals(3, dq.size());
        dq.removeLast();
        assertEquals(12, dq.getLast());
    }

    @Test
    public void testVector(){
        Vector<Integer> vctr = new Vector<>();
        assertEquals(true, vctr.isEmpty());
        vctr.add(7);
        assertEquals(true, vctr.contains(7));
        vctr.add(5);
        assertEquals(5, vctr.get(1));
        assertEquals(5, vctr.lastElement());
        assertEquals(7, vctr.firstElement());
        vctr.removeAll();
        assertEquals(true, vctr.isEmpty());
    }

    @Test
    public void testTreeMap(){
        TreeMap<Integer, String> treeM = new TreeMap<>();
        treeM.put(1, "happy");
        treeM.put(2, "fine");
        assertEquals(2, treeM.lastKey());
        assertEquals(2, treeM.size());
        treeM.remove(1);
        assertEquals(2, treeM.firstKey());
        assertEquals(null, treeM.get(4));
    }

    @Test
    public void testTreeSet(){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        assertEquals(false, ts.isEmpty());
        assertEquals(1, ts.size());
        ts.add("D");
        ts.add("F");
        assertEquals("A", ts.first());
        assertEquals("F", ts.last());
        assertEquals("D", ts.lower("F"));
        ts.remove("A");
        assertEquals(2, ts.size());
    }

    @Test
    public void testIterator(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ListIterator arritr = arr.listIterator();
        while(arritr.hasNext()){
            Object element = arritr.next();
        }
        // return arritr = 1,2,3;
        while(arritr.hasPrevious()){
            Object element = arritr.previous())
        }
        //return arritr = 3,2,1
        //not sure how to do this one, but it's cool to see what it does

    }

    @Test
    public void PriorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(11);
        pq.add(33);
        pq.add(22);
        assertEquals(3, pq.size());
        assertEquals(11, pq.peek());
        pq.poll();
        assertEquals(false, pq.contains(11));
        pq.remove(22);
        assertEquals(1, pq.size());

    }

    @Test
    public void testComparable(){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Moe";
        String str4 = "Joe";
        assertEquals(0, str1.compareTo(str2));
        assertEquals(-1, str4.compareTo(str3));
        assertEquals(1, str4.compareTo(str1));

    }





    // Make a bigger test exercising more Stack methods.....
}
