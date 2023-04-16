#   >> PYTHON CODE <<


def JobScheduling(self,Jobs,n):
    jobsDone=[False]*n
    
    Jobs.sort(key=lambda x: -x.profit)
    
    
    cnt,profit=0,0
    
    for job in Jobs:
        for i in range(min(job.deadline-1,n-1),-1,-1):
            if jobsDone[i]==False:
                cnt+=1
                profit+=job.profit
                jobsDone[i]=True;
                break
    
    return [cnt,profit]