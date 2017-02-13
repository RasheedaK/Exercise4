class Navigator {
    Position move(Position position,String instruction) {
        for(int i=0;i<instruction.length();i++){
            if(instruction.charAt(i)=='L')
                position=turnLeft(position);
            else if(instruction.charAt(i)=='R')
                position=turnRight(position);
            else
                position=new Position(1,2,'E');
        }
        return position;
    }

    private Position turnLeft(Position position) {
        if(position.getDirection()=='E')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'N');
        if(position.getDirection()=='W')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'S');
        if(position.getDirection()=='N')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'W');
        else
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'E');
    }
    private Position turnRight(Position position) {
        if(position.getDirection()=='E')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'S');
        if(position.getDirection()=='W')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'N');
        if(position.getDirection()=='N')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'E');
        else
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'W');
    }
}
