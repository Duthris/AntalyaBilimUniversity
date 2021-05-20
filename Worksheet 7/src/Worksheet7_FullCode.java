import java.util.Scanner;

// Adem Anil YALIMDEMIR - 180201017 - Worksheet 7 - Full Code

public class Worksheet7_FullCode 
{
	class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val)
		{	
			this.val = val;
			left = null;
			right = null;
			val = 0;
		}
	}
	
	static TreeNode root = null;
	
	public void InsertBinaryhTree(int val)
	{
		TreeNode tempTreeNode = new TreeNode(val);
		
		if  (root == null)
		{
			root = tempTreeNode;
			return;
		}
		
		TreeNode currTreeNode = root;
		
		TreeNode mainTreeNode = null;
		
		while (true)
		{
			mainTreeNode = currTreeNode;
			
			if (val < currTreeNode.val)
			{
				currTreeNode = currTreeNode.left;
				
				if (currTreeNode == null)
				{
					mainTreeNode.left = tempTreeNode;
					return;
				}
			}
			
			else if (val > currTreeNode.val) 
			{
				currTreeNode = currTreeNode.right;
				
				if (currTreeNode == null)
				{
					mainTreeNode.right = tempTreeNode;
					return;
				}
			}
			
			else 
			{
				System.out.printf("\n%d is already exist in TREE!\n", val);
				break;
			}
			
		}
	}

	
	public void PrintTree(TreeNode root)
	{
		if (root == null)
		{

		}
		
		else 
		{
			PrintTree(root.left);
			
			System.out.print(root.val + " ");
			
			PrintTree(root.right);
			
		}
	}
	
	
	public int IterativeFindMaximum()
	{
		int maxOfTree = 0;
		
		if (root == null)
		{
			System.out.println("\nTree is Empty!");
		}
		
		else 
		{	
			maxOfTree = root.val;
			
			while (root.right != null)
			{
				maxOfTree = root.right.val;
				root = root.right;
			}
			
			return maxOfTree;
		}
		
		return maxOfTree;
	}
	
	
	public int IterativeFindMinimum()
	{
		int minOfTree = 0;
		
		TreeNode tempTree = root;
		
		if (tempTree == null)
		{
			System.out.println("\nTree is Empty!");
		}
		
		else 
		{
			minOfTree = tempTree.val;
			
			while (tempTree.left != null)
			{
				minOfTree = tempTree.left.val;
				tempTree = tempTree.left;
			}
			
			return minOfTree;
		}
		
		return minOfTree;
	}
	
	
	public TreeNode findElement(TreeNode root, int val)
	{
		if (root == null)
		{
			return root;
		}
		
		if (root.val == val)
		{
			return root;
		}
		
		else if (root.val > val)
		{
			return findElement(root.left, val);
		}
		
		else 
		{
			return findElement(root.right, val);
		}
	}
	
	public int CountNodes(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		
		else 
		{
			return 1 + CountNodes(root.left) + CountNodes(root.right);
		}
	}
	


	public static void main(String[] args) 
	{
		int operation;
		int val;
		int findOperation;

		Worksheet7_FullCode tree = new Worksheet7_FullCode();
		
		Scanner scn = new Scanner(System.in);
		
		do {
			
			System.out.print("\nEnter 1 to Insert | Enter 2 to Print | Enter 3 to Find Operations | Enter 4 to Count Nodes | -1 to exit: ");
			operation = scn.nextInt();
			
			switch (operation) 
			{
			
			case 1: 
			{	
				System.out.print("\nEnter the value to insert in tree: ");
				val = scn.nextInt();
				
				tree.InsertBinaryhTree(val);
			
				break;
			}
			
			case 2:
			{
				if (root == null)
				{
					System.out.println("\nTree is Empty! Nothing to Print!");
				}
				
				else
				{
					System.out.print("\nCreated Tree: ");
					tree.PrintTree(root);
					System.out.println("");
				}
				
				break;
			}
			
			case 3:
			{
				System.out.println("\nWhat you want to find ?\n");
				
				System.out.println("1: Maximum of Tree\n2: Minimum of Tree\n3: Find an Element\n  (-1 to exit)\n");
				
				System.out.print("Enter the Option: ");
				
				findOperation = scn.nextInt();
				
				while (findOperation != -1)
				{
					if (findOperation == 1)
					{
						if (root != null)
						{
							System.out.println("\nMaximum number of Tree: " + tree.IterativeFindMaximum());
						}
						
						else 
						{
							System.out.println("\nTree is Empty!");			
						}
						
						break;
					}
					
					if (findOperation == 2)
					{
						if (root != null)
						{
							System.out.println("\nMinimum number of Tree: " + tree.IterativeFindMinimum());
						}
						
						else 
						{
							System.out.println("\nTree is Empty!");			
						}
						
						break;
					}
					
					if (findOperation == 3)
					{
						if (root == null)
						{
							System.out.println("\nTree is Empty! You cannot search an element!");
							
							break;
						}
						
						else 
						{
							System.out.print("\nEnter the value you want to find if exist or not in tree: ");
							val = scn.nextInt();
							TreeNode foundedNode = tree.findElement(root, val);	
							
							if (foundedNode == null)
							{
								System.out.printf("\nNode COULD NOT BE FOUND!\n%d doese NOT Exist in Tree!\n", val);
							}
							
							else 
							{
								System.out.printf("\nNode found!\nFounded Value in Tree: %d\n", val);		
							}
							
							break;
						}
					}
					
					else
					{
						System.out.println("\nWrong Operation is Entered! Please Choose a Correct Operation!");
						break;
					}
					
				}
				
				break;
			}
			
			case 4:
			{
				if (root == null)
				{
					System.out.println("\nTree is Empty!");
				}
				
				else 
				{
					System.out.println("\nCount of Nodes in Tree: " + (tree.CountNodes(root)));
				}
			}
			
			}
			
		} while (operation != -1);

	}

}
