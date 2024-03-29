package com.machinelearning.doc_classifier.document;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class DocumentFactory {
	public static String s;
	public static Document create(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		return createForTest(sc);
	}

	private static Document createForTest(Scanner sc) {
		Document document = new Document();
		
		while(sc.hasNext()) {
			String word = sc.next();
			word=word.replaceAll("\\p{P}", "").toLowerCase();
			HashSet<String> stopWordsSet = new HashSet<String>();
			stopWordsSet.add("a");
		    stopWordsSet.add("able");
		    stopWordsSet.add("about");
		    stopWordsSet.add("above");
		    stopWordsSet.add("according");
		    stopWordsSet.add("accordingly");
		    stopWordsSet.add("across");
		    stopWordsSet.add("actually");
		    stopWordsSet.add("after");
		    stopWordsSet.add("afterwards");
		    stopWordsSet.add("again");
		    stopWordsSet.add("against");
		    stopWordsSet.add("all");
		    stopWordsSet.add("allow");
		    stopWordsSet.add("allows");
		    stopWordsSet.add("almost");
		    stopWordsSet.add("alone");
		    stopWordsSet.add("along");
		    stopWordsSet.add("already");
		    stopWordsSet.add("also");
		    stopWordsSet.add("although");
		    stopWordsSet.add("always");
		    stopWordsSet.add("am");
		    stopWordsSet.add("among");
		    stopWordsSet.add("amongst");
		    stopWordsSet.add("an");
		    stopWordsSet.add("and");
		    stopWordsSet.add("another");
		    stopWordsSet.add("any");
		    stopWordsSet.add("anybody");
		    stopWordsSet.add("anyhow");
		    stopWordsSet.add("anyone");
		    stopWordsSet.add("anything");
		    stopWordsSet.add("anyway");
		    stopWordsSet.add("anyways");
		    stopWordsSet.add("anywhere");
		    stopWordsSet.add("apart");
		    stopWordsSet.add("appear");
		    stopWordsSet.add("appreciate");
		    stopWordsSet.add("appropriate");
		    stopWordsSet.add("are");
		    stopWordsSet.add("around");
		    stopWordsSet.add("as");
		    stopWordsSet.add("aside");
		    stopWordsSet.add("ask");
		    stopWordsSet.add("asking");
		    stopWordsSet.add("associated");
		    stopWordsSet.add("at");
		    stopWordsSet.add("available");
		    stopWordsSet.add("away");
		    stopWordsSet.add("awfully");
		    stopWordsSet.add("b");
		    stopWordsSet.add("be");
		    stopWordsSet.add("became");
		    stopWordsSet.add("because");
		    stopWordsSet.add("become");
		    stopWordsSet.add("becomes");
		    stopWordsSet.add("becoming");
		    stopWordsSet.add("been");
		    stopWordsSet.add("before");
		    stopWordsSet.add("beforehand");
		    stopWordsSet.add("behind");
		    stopWordsSet.add("being");
		    stopWordsSet.add("believe");
		    stopWordsSet.add("below");
		    stopWordsSet.add("beside");
		    stopWordsSet.add("besides");
		    stopWordsSet.add("best");
		    stopWordsSet.add("better");
		    stopWordsSet.add("between");
		    stopWordsSet.add("beyond");
		    stopWordsSet.add("both");
		    stopWordsSet.add("brief");
		    stopWordsSet.add("but");
		    stopWordsSet.add("by");
		    stopWordsSet.add("c");
		    stopWordsSet.add("came");
		    stopWordsSet.add("can");
		    stopWordsSet.add("cannot");
		    stopWordsSet.add("cant");
		    stopWordsSet.add("cause");
		    stopWordsSet.add("causes");
		    stopWordsSet.add("certain");
		    stopWordsSet.add("certainly");
		    stopWordsSet.add("changes");
		    stopWordsSet.add("clearly");
		    stopWordsSet.add("co");
		    stopWordsSet.add("com");
		    stopWordsSet.add("come");
		    stopWordsSet.add("comes");
		    stopWordsSet.add("concerning");
		    stopWordsSet.add("consequently");
		    stopWordsSet.add("consider");
		    stopWordsSet.add("considering");
		    stopWordsSet.add("contain");
		    stopWordsSet.add("containing");
		    stopWordsSet.add("contains");
		    stopWordsSet.add("corresponding");
		    stopWordsSet.add("could");
		    stopWordsSet.add("course");
		    stopWordsSet.add("currently");
		    stopWordsSet.add("d");
		    stopWordsSet.add("definitely");
		    stopWordsSet.add("described");
		    stopWordsSet.add("despite");
		    stopWordsSet.add("did");
		    stopWordsSet.add("different");
		    stopWordsSet.add("do");
		    stopWordsSet.add("does");
		    stopWordsSet.add("doing");
		    stopWordsSet.add("done");
		    stopWordsSet.add("down");
		    stopWordsSet.add("downwards");
		    stopWordsSet.add("during");
		    stopWordsSet.add("e");
		    stopWordsSet.add("each");
		    stopWordsSet.add("edu");
		    stopWordsSet.add("eg");
		    stopWordsSet.add("eight");
		    stopWordsSet.add("either");
		    stopWordsSet.add("else");
		    stopWordsSet.add("elsewhere");
		    stopWordsSet.add("enough");
		    stopWordsSet.add("entirely");
		    stopWordsSet.add("especially");
		    stopWordsSet.add("et");
		    stopWordsSet.add("etc");
		    stopWordsSet.add("even");
		    stopWordsSet.add("ever");
		    stopWordsSet.add("every");
		    stopWordsSet.add("everybody");
		    stopWordsSet.add("everyone");
		    stopWordsSet.add("everything");
		    stopWordsSet.add("everywhere");
		    stopWordsSet.add("ex");
		    stopWordsSet.add("exactly");
		    stopWordsSet.add("example");
		    stopWordsSet.add("except");
		    stopWordsSet.add("f");
		    stopWordsSet.add("far");
		    stopWordsSet.add("few");
		    stopWordsSet.add("fifth");
		    stopWordsSet.add("first");
		    stopWordsSet.add("five");
		    stopWordsSet.add("followed");
		    stopWordsSet.add("following");
		    stopWordsSet.add("follows");
		    stopWordsSet.add("for");
		    stopWordsSet.add("former");
		    stopWordsSet.add("formerly");
		    stopWordsSet.add("forth");
		    stopWordsSet.add("four");
		    stopWordsSet.add("from");
		    stopWordsSet.add("further");
		    stopWordsSet.add("furthermore");
		    stopWordsSet.add("g");
		    stopWordsSet.add("get");
		    stopWordsSet.add("gets");
		    stopWordsSet.add("getting");
		    stopWordsSet.add("given");
		    stopWordsSet.add("gives");
		    stopWordsSet.add("go");
		    stopWordsSet.add("goes");
		    stopWordsSet.add("going");
		    stopWordsSet.add("gone");
		    stopWordsSet.add("got");
		    stopWordsSet.add("gotten");
		    stopWordsSet.add("greetings");
		    stopWordsSet.add("h");
		    stopWordsSet.add("had");
		    stopWordsSet.add("happens");
		    stopWordsSet.add("hardly");
		    stopWordsSet.add("has");
		    stopWordsSet.add("have");
		    stopWordsSet.add("having");
		    stopWordsSet.add("he");
		    stopWordsSet.add("hello");
		    stopWordsSet.add("help");
		    stopWordsSet.add("hence");
		    stopWordsSet.add("her");
		    stopWordsSet.add("here");
		    stopWordsSet.add("hereafter");
		    stopWordsSet.add("hereby");
		    stopWordsSet.add("herein");
		    stopWordsSet.add("hereupon");
		    stopWordsSet.add("hers");
		    stopWordsSet.add("herself");
		    stopWordsSet.add("hi");
		    stopWordsSet.add("him");
		    stopWordsSet.add("himself");
		    stopWordsSet.add("his");
		    stopWordsSet.add("hither");
		    stopWordsSet.add("hopefully");
		    stopWordsSet.add("how");
		    stopWordsSet.add("howbeit");
		    stopWordsSet.add("however");
		    stopWordsSet.add("i");
		    stopWordsSet.add("ie");
		    stopWordsSet.add("if");
		    stopWordsSet.add("ignored");
		    stopWordsSet.add("immediate");
		    stopWordsSet.add("in");
		    stopWordsSet.add("inasmuch");
		    stopWordsSet.add("inc");
		    stopWordsSet.add("indeed");
		    stopWordsSet.add("indicate");
		    stopWordsSet.add("indicated");
		    stopWordsSet.add("indicates");
		    stopWordsSet.add("inner");
		    stopWordsSet.add("insofar");
		    stopWordsSet.add("instead");
		    stopWordsSet.add("into");
		    stopWordsSet.add("inward");
		    stopWordsSet.add("is");
		    stopWordsSet.add("it");
		    stopWordsSet.add("its");
		    stopWordsSet.add("itself");
		    stopWordsSet.add("j");
		    stopWordsSet.add("just");
		    stopWordsSet.add("k");
		    stopWordsSet.add("keep");
		    stopWordsSet.add("keeps");
		    stopWordsSet.add("kept");
		    stopWordsSet.add("know");
		    stopWordsSet.add("knows");
		    stopWordsSet.add("known");
		    stopWordsSet.add("l");
		    stopWordsSet.add("last");
		    stopWordsSet.add("lately");
		    stopWordsSet.add("later");
		    stopWordsSet.add("latter");
		    stopWordsSet.add("latterly");
		    stopWordsSet.add("least");
		    stopWordsSet.add("less");
		    stopWordsSet.add("lest");
		    stopWordsSet.add("let");
		    stopWordsSet.add("like");
		    stopWordsSet.add("liked");
		    stopWordsSet.add("likely");
		    stopWordsSet.add("little");
		    stopWordsSet.add("ll"); // added to avoid words like you'll,I'll etc.
		    stopWordsSet.add("look");
		    stopWordsSet.add("looking");
		    stopWordsSet.add("looks");
		    stopWordsSet.add("ltd");
		    stopWordsSet.add("m");
		    stopWordsSet.add("mainly");
		    stopWordsSet.add("many");
		    stopWordsSet.add("may");
		    stopWordsSet.add("maybe");
		    stopWordsSet.add("me");
		    stopWordsSet.add("mean");
		    stopWordsSet.add("meanwhile");
		    stopWordsSet.add("merely");
		    stopWordsSet.add("might");
		    stopWordsSet.add("more");
		    stopWordsSet.add("moreover");
		    stopWordsSet.add("most");
		    stopWordsSet.add("mostly");
		    stopWordsSet.add("much");
		    stopWordsSet.add("must");
		    stopWordsSet.add("my");
		    stopWordsSet.add("myself");
		    stopWordsSet.add("n");
		    stopWordsSet.add("name");
		    stopWordsSet.add("namely");
		    stopWordsSet.add("nd");
		    stopWordsSet.add("near");
		    stopWordsSet.add("nearly");
		    stopWordsSet.add("necessary");
		    stopWordsSet.add("need");
		    stopWordsSet.add("needs");
		    stopWordsSet.add("neither");
		    stopWordsSet.add("never");
		    stopWordsSet.add("nevertheless");
		    stopWordsSet.add("new");
		    stopWordsSet.add("next");
		    stopWordsSet.add("nine");
		    stopWordsSet.add("no");
		    stopWordsSet.add("nobody");
		    stopWordsSet.add("non");
		    stopWordsSet.add("none");
		    stopWordsSet.add("noone");
		    stopWordsSet.add("nor");
		    stopWordsSet.add("normally");
		    stopWordsSet.add("not");
		    stopWordsSet.add("nothing");
		    stopWordsSet.add("novel");
		    stopWordsSet.add("now");
		    stopWordsSet.add("nowhere");
		    stopWordsSet.add("o");
		    stopWordsSet.add("obviously");
		    stopWordsSet.add("of");
		    stopWordsSet.add("off");
		    stopWordsSet.add("often");
		    stopWordsSet.add("oh");
		    stopWordsSet.add("ok");
		    stopWordsSet.add("okay");
		    stopWordsSet.add("old");
		    stopWordsSet.add("on");
		    stopWordsSet.add("once");
		    stopWordsSet.add("one");
		    stopWordsSet.add("ones");
		    stopWordsSet.add("only");
		    stopWordsSet.add("onto");
		    stopWordsSet.add("or");
		    stopWordsSet.add("other");
		    stopWordsSet.add("others");
		    stopWordsSet.add("otherwise");
		    stopWordsSet.add("ought");
		    stopWordsSet.add("our");
		    stopWordsSet.add("ours");
		    stopWordsSet.add("ourselves");
		    stopWordsSet.add("out");
		    stopWordsSet.add("outside");
		    stopWordsSet.add("over");
		    stopWordsSet.add("overall");
		    stopWordsSet.add("own");
		    stopWordsSet.add("p");
		    stopWordsSet.add("particular");
		    stopWordsSet.add("particularly");
		    stopWordsSet.add("per");
		    stopWordsSet.add("perhaps");
		    stopWordsSet.add("placed");
		    stopWordsSet.add("please");
		    stopWordsSet.add("plus");
		    stopWordsSet.add("possible");
		    stopWordsSet.add("presumably");
		    stopWordsSet.add("probably");
		    stopWordsSet.add("provides");
		    stopWordsSet.add("q");
		    stopWordsSet.add("que");
		    stopWordsSet.add("quite");
		    stopWordsSet.add("qv");
		    stopWordsSet.add("r");
		    stopWordsSet.add("rather");
		    stopWordsSet.add("rd");
		    stopWordsSet.add("re");
		    stopWordsSet.add("really");
		    stopWordsSet.add("reasonably");
		    stopWordsSet.add("regarding");
		    stopWordsSet.add("regardless");
		    stopWordsSet.add("regards");
		    stopWordsSet.add("relatively");
		    stopWordsSet.add("respectively");
		    stopWordsSet.add("right");
		    stopWordsSet.add("s");
		    stopWordsSet.add("said");
		    stopWordsSet.add("same");
		    stopWordsSet.add("saw");
		    stopWordsSet.add("say");
		    stopWordsSet.add("saying");
		    stopWordsSet.add("says");
		    stopWordsSet.add("second");
		    stopWordsSet.add("secondly");
		    stopWordsSet.add("see");
		    stopWordsSet.add("seeing");
		    stopWordsSet.add("seem");
		    stopWordsSet.add("seemed");
		    stopWordsSet.add("seeming");
		    stopWordsSet.add("seems");
		    stopWordsSet.add("seen");
		    stopWordsSet.add("self");
		    stopWordsSet.add("selves");
		    stopWordsSet.add("sensible");
		    stopWordsSet.add("sent");
		    stopWordsSet.add("serious");
		    stopWordsSet.add("seriously");
		    stopWordsSet.add("seven");
		    stopWordsSet.add("several");
		    stopWordsSet.add("shall");
		    stopWordsSet.add("she");
		    stopWordsSet.add("should");
		    stopWordsSet.add("since");
		    stopWordsSet.add("six");
		    stopWordsSet.add("so");
		    stopWordsSet.add("some");
		    stopWordsSet.add("somebody");
		    stopWordsSet.add("somehow");
		    stopWordsSet.add("someone");
		    stopWordsSet.add("something");
		    stopWordsSet.add("sometime");
		    stopWordsSet.add("sometimes");
		    stopWordsSet.add("somewhat");
		    stopWordsSet.add("somewhere");
		    stopWordsSet.add("soon");
		    stopWordsSet.add("sorry");
		    stopWordsSet.add("specified");
		    stopWordsSet.add("specify");
		    stopWordsSet.add("specifying");
		    stopWordsSet.add("still");
		    stopWordsSet.add("sub");
		    stopWordsSet.add("such");
		    stopWordsSet.add("sup");
		    stopWordsSet.add("sure");
		    stopWordsSet.add("t");
		    stopWordsSet.add("take");
		    stopWordsSet.add("taken");
		    stopWordsSet.add("tell");
		    stopWordsSet.add("tends");
		    stopWordsSet.add("th");
		    stopWordsSet.add("than");
		    stopWordsSet.add("thank");
		    stopWordsSet.add("thanks");
		    stopWordsSet.add("thanx");
		    stopWordsSet.add("that");
		    stopWordsSet.add("thats");
		    stopWordsSet.add("the");
		    stopWordsSet.add("their");
		    stopWordsSet.add("theirs");
		    stopWordsSet.add("them");
		    stopWordsSet.add("themselves");
		    stopWordsSet.add("then");
		    stopWordsSet.add("thence");
		    stopWordsSet.add("there");
		    stopWordsSet.add("thereafter");
		    stopWordsSet.add("thereby");
		    stopWordsSet.add("therefore");
		    stopWordsSet.add("therein");
		    stopWordsSet.add("theres");
		    stopWordsSet.add("thereupon");
		    stopWordsSet.add("these");
		    stopWordsSet.add("they");
		    stopWordsSet.add("think");
		    stopWordsSet.add("third");
		    stopWordsSet.add("this");
		    stopWordsSet.add("thorough");
		    stopWordsSet.add("thoroughly");
		    stopWordsSet.add("those");
		    stopWordsSet.add("though");
		    stopWordsSet.add("three");
		    stopWordsSet.add("through");
		    stopWordsSet.add("throughout");
		    stopWordsSet.add("thru");
		    stopWordsSet.add("thus");
		    stopWordsSet.add("to");
		    stopWordsSet.add("together");
		    stopWordsSet.add("too");
		    stopWordsSet.add("took");
		    stopWordsSet.add("toward");
		    stopWordsSet.add("towards");
		    stopWordsSet.add("tried");
		    stopWordsSet.add("tries");
		    stopWordsSet.add("truly");
		    stopWordsSet.add("try");
		    stopWordsSet.add("trying");
		    stopWordsSet.add("twice");
		    stopWordsSet.add("two");
		    stopWordsSet.add("u");
		    stopWordsSet.add("un");
		    stopWordsSet.add("under");
		    stopWordsSet.add("unfortunately");
		    stopWordsSet.add("unless");
		    stopWordsSet.add("unlikely");
		    stopWordsSet.add("until");
		    stopWordsSet.add("unto");
		    stopWordsSet.add("up");
		    stopWordsSet.add("upon");
		    stopWordsSet.add("us");
		    stopWordsSet.add("use");
		    stopWordsSet.add("used");
		    stopWordsSet.add("useful");
		    stopWordsSet.add("uses");
		    stopWordsSet.add("using");
		    stopWordsSet.add("usually");
		    stopWordsSet.add("uucp");
		    stopWordsSet.add("v");
		    stopWordsSet.add("value");
		    stopWordsSet.add("various");
		    stopWordsSet.add("ve"); // added to avoid words like I've,you've etc.
		    stopWordsSet.add("very");
		    stopWordsSet.add("via");
		    stopWordsSet.add("viz");
		    stopWordsSet.add("vs");
		    stopWordsSet.add("w");
		    stopWordsSet.add("want");
		    stopWordsSet.add("wants");
		    stopWordsSet.add("was");
		    stopWordsSet.add("way");
		    stopWordsSet.add("we");
		    stopWordsSet.add("welcome");
		    stopWordsSet.add("well");
		    stopWordsSet.add("went");
		    stopWordsSet.add("were");
		    stopWordsSet.add("what");
		    stopWordsSet.add("whatever");
		    stopWordsSet.add("when");
		    stopWordsSet.add("whence");
		    stopWordsSet.add("whenever");
		    stopWordsSet.add("where");
		    stopWordsSet.add("whereafter");
		    stopWordsSet.add("whereas");
		    stopWordsSet.add("whereby");
		    stopWordsSet.add("wherein");
		    stopWordsSet.add("whereupon");
		    stopWordsSet.add("wherever");
		    stopWordsSet.add("whether");
		    stopWordsSet.add("which");
		    stopWordsSet.add("while");
		    stopWordsSet.add("whither");
		    stopWordsSet.add("who");
		    stopWordsSet.add("whoever");
		    stopWordsSet.add("whole");
		    stopWordsSet.add("whom");
		    stopWordsSet.add("whose");
		    stopWordsSet.add("why");
		    stopWordsSet.add("will");
		    stopWordsSet.add("willing");
		    stopWordsSet.add("wish");
		    stopWordsSet.add("with");
		    stopWordsSet.add("within");
		    stopWordsSet.add("without");
		    stopWordsSet.add("wonder");
		    stopWordsSet.add("would");
		    stopWordsSet.add("would");
		    stopWordsSet.add("x");
		    stopWordsSet.add("y");
		    stopWordsSet.add("yes");
		    stopWordsSet.add("yet");
		    stopWordsSet.add("you");
		    stopWordsSet.add("your");
		    stopWordsSet.add("yours");
		    stopWordsSet.add("yourself");
		    stopWordsSet.add("yourselves");
		    stopWordsSet.add("z");
		    stopWordsSet.add("zero");
		    for(int i=0;i<stopWordsSet.size();i++)
		    {
		        String wordCompare = word.toLowerCase();
		        if(!stopWordsSet.contains(wordCompare))
		        {
		           s=word;
		        }
		    
		    }
			if(!document.getWordVector().containsKey(s)) {
				document.getWordVector().put(s, 1);
			}
			else {
				int c = document.getWordVector().get(s);
				c++;
				document.getWordVector().put(s, c);
			}
			document.increaseDistinctWordPosition();
		}
		sc.close();
		
		return document;	
	}
}
