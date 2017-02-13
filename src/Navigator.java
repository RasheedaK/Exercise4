class Navigator {
    Position move(Position position,String instruction) {
        for(int i=0;i<instruction.length();i++){
            if(instruction.charAt(i)=='L')
                position=new Position(1,2,'N');
            else
                position=new Position(2,2,'E');
        }
        return position;
    }
}
