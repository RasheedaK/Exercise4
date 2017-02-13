class Navigator {
    Position move(Position position,String instruction) {
        for(int i=0;i<instruction.length();i++){
            if(instruction.charAt(i)=='L')
                position=turnLeft(position);
            else if(instruction.charAt(i)=='R')
                position=turnRight(position);
            else
                position=takeStep(position);
        }
        return position;
    }

    private Position takeStep(Position position) {
        if(position.getDirection()=='E')
            return new Position(position.incrementX(),position.getYcoordinate(),'E');
        if(position.getDirection()=='W')
            return new Position(position.decrementX(),position.getYcoordinate(),'W');
        if(position.getDirection()=='N')
            return new Position(position.getXcoordinate(),position.incrementY(),'N');
        else
            return new Position(position.getXcoordinate(),position.decrementY(),'S');
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
