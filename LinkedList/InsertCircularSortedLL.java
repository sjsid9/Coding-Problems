public static void insert(Node head,int value,int n)
         {
            Node tail=null,temp=head;
            for(int i=0;i<n;i++){
                tail=temp;
                temp=temp.next;
            }
            temp=head;
            if(value<=head.data){
                Node nn= new Node(value);
                tail.next=nn;
                nn.next=head;
                head=nn;
            }
            else if(value>head.data && value>tail.data){
                Node nn=new Node(value);
                nn.next=head.next;
                tail.next=nn;
            }
            else{
                temp=head;
                while(temp!=null){
                    if(value>=temp.data && value<temp.next.data){
                    Node nn=new Node(value);
                    nn.next=temp.next;
                    temp.next=nn;
                    break;
                    }
                    temp=temp.next;
                }
            }
            temp=head;
            for(int i=0;i<n+1;i++){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            
         }