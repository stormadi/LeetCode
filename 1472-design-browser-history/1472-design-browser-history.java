class BrowserHistory {
    int currIndex, endIndex;
    List<String> history;
    
    public BrowserHistory(String homepage) {
        currIndex = 0; 
        endIndex = 0;
        history = new ArrayList<>();
        visit(homepage);
    }
    
    public void visit(String url) {
        history.add(currIndex++, url);
        endIndex = currIndex;
    }
    
    public String back(int steps) {
        currIndex = Math.max(1, currIndex - steps);
	    return history.get(currIndex - 1);
    }
    
    public String forward(int steps) {
        currIndex = Math.min(endIndex, currIndex + steps);
	    return history.get(currIndex - 1);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */