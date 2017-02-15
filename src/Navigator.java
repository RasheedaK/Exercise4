class Navigator {
    Position move(Position position,String instruction) {
        for(int i=0;i<instruction.length();i++){
            if(instruction.charAt(i)=='L')
                position= turnRoverLeft(position);
            else if(instruction.charAt(i)=='R')
                position= turnRoverRight(position);
            else
                position= moveRoverAhead(position);
        }
        return position;
    }

    Position moveRoverAhead(Position position) {
        if(position.getDirection()=='E')
            return position.getRightPosition();
        if(position.getDirection()=='W')
            return position.getLeftPosition();
        if(position.getDirection()=='N')
            return position.getTopPosition();
        else
            return position.getDownPosition();
    }

    Position turnRoverLeft(Position position) {
        if(position.getDirection()=='E')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'N');
        if(position.getDirection()=='W')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'S');
        if(position.getDirection()=='N')
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'W');
        else
            return new Position(position.getXcoordinate(),position.getYcoordinate(),'E');
    }
    Position turnRoverRight(Position position) {
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
