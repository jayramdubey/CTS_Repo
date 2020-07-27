package jpmc;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class NonRepeatedChar {
	private static final Logger LOG = Logger.getLogger(NonRepeatedChar.class.getName());

	public interface Solver {
		/**
		 * This method finds the first non repeated character in a word
		 *
		 * @param word
		 *            The input where we're looking for the first non reapeated
		 *            character
		 * @return a single character or [empty] in all other cases.
		 */
		Optional<Character> firstNonRepeated(String word);

	}

	private static class SolverImpl implements Solver {

		@Override
		public Optional<Character> firstNonRepeated(final String word) {
			if (word != null) {

				Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
				for (char c : word.toCharArray()) {
					hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
				}
				for (Map.Entry<Character, Integer> etry : hm.entrySet()) {
					if (etry.getValue() == 1)
						return Optional.of(etry.getKey()); // entry.getKey();
				}
			}
			return Optional.empty();
		}
	}

	public static void main(String[] args) throws IOException {
		LOG.info("Starting");

		if (args.length != 1) {
			throw new IllegalArgumentException(
					String.format("One and only one arguments is expected, received %d", args.length));
		}
		SolverImpl solver = new SolverImpl();
		Optional<Character> notRepeated = solver.firstNonRepeated("jayram");
		LOG.info((notRepeated.map(String::valueOf).orElse("<NULL>")));
	}
	
	public static class SolverTest {

	    public static void main(String[] args) {
	      JUnitCore junit = new JUnitCore();
	      junit.addListener(new TextListener(System.out));
	      junit.run(NonRepeatedChar.SolverTest.class);
	    }

	    @Test
	    public void testRepeatedChar() {
	        
	        Optional<Character> expected = Optional.of('b');
	        SolverImpl solverImpl = new SolverImpl();
	        Optional<Character> actual = solverImpl.firstNonRepeated("abhay");
	        Assert.assertEquals(expected,actual);
	    }
	    
	    @Test
	    public void testRepeatedCharForNull() {
	        
	        Optional<String> expected = Optional.empty();
	        SolverImpl solverImpl = new SolverImpl();
	        Optional<Character> actual = solverImpl.firstNonRepeated(null);
	        Assert.assertEquals(expected,actual);
	       
	      
	    }    
	  }

}
