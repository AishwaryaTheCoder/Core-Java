class stringBufferReaded {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Aish");
        // below two are principal ops on stringbuffer and are methodoverloaded to
        // accept data of any type.
        sb.append("Kotwal. The coder");
        sb.insert(0, "Hello ");
        System.out.println(sb);

    }
}
