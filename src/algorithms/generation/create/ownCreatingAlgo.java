package algorithms.generation.create;

import labyrinth.Cell;
import labyrinth.Maze;
import main.Conf;

/**
 * this algorithm is a creating algotihm with a own created algorithm, which is
 * near to the kruscal algorithm
 * 
 * @author micha
 * 
 */
public class ownCreatingAlgo extends ACreatingAlgorithms {

	
	
	
	public ownCreatingAlgo(Maze maze, Conf globalConf) {
		super(maze);
		_configs = globalConf;
		setName("<<eigener CreatingAlgo>>");
	}


	private void defineStartandEndCell() {
		_maze.createEntranceAndExit();
	}

	public void createMaze() {
		Cell randomCell;
		Cell NeighbourCell;
		while (_maze.hasMultipleRoots()) {
			randomCell = _maze.getRandomCell();
			NeighbourCell = _maze.getRandomNeighbour(randomCell);

			if (!randomCell.getRoot().equals(NeighbourCell.getRoot())) {
				_maze.breakWallBetweenCells(randomCell, NeighbourCell);
				// TODO: comment out the following four lines as these are
				// testing only
				System.out.println("asdfasdf " + _configs);
				_maze.printAsciiMaze();
				_configs.get_output().printLine(" ");
			} else {
				_configs.get_output().printLine("impossibru");
			}
		}
		defineStartandEndCell();
		_maze.printAsciiMaze();
	}

}
