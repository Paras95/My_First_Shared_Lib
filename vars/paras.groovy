
import org.foo.ParasSrc

def call(){
    sh"ls -al"
    echo "my first vars function"
}

def beta(){
    echo "from beta"
}

def class1(){
    def obj = new ParasSrc(this, this)
    obj.env()
}

def unique(name){
    echo "my name is ${name}"
}
