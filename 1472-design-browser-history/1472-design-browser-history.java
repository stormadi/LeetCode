class BrowserHistory {
    Stack<String> browser = new Stack<>();
    Stack<String> history = new Stack<>();
    String temp;
    
    public BrowserHistory(String homepage) {
        browser.push(homepage);
        return;
    }
    
    public void visit(String url) {
        if(history.size() != 0)
        {
            while(!history.isEmpty())
            {
                history.pop();
            }
            browser.push(url);
            return;
        }
        browser.push(url);
        return;
    }
    
    public String back(int steps) {
        if(steps > browser.size())
        {
            while(browser.size() != 1)
            {
                history.push(browser.pop());
            }
            return browser.peek();
        }
        else
        {
            while(steps != 0)
            {
                if(browser.size() == 1)
                {
                    break;
                }
                history.push(browser.pop());
                steps--;
            }
            return browser.peek();
        }
    }
    
    public String forward(int steps) {
        if(steps > history.size())
        {
            while(!history.isEmpty())
            {
                browser.push(history.pop());
            }
            return browser.peek();
        }
        else
        {
            while(steps != 0)
            {
                browser.push(history.pop());
                steps--;
            }
            return browser.peek();
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */