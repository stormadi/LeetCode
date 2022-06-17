class BrowserHistory {
    int pos, max;
    List<String> browser;
    
    public BrowserHistory(String homepage) {
        pos = 0; 
        max = 0;
        browser = new ArrayList<>();
        visit(homepage);
    }
    
    public void visit(String url) {
        browser.add(pos++, url);
        max = pos;
    }
    
    public String back(int steps) {
        pos = Math.max(1, pos - steps);
	    return browser.get(pos - 1);
    }
    
    public String forward(int steps) {
        pos = Math.min(max, pos + steps);
	    return browser.get(pos - 1);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
