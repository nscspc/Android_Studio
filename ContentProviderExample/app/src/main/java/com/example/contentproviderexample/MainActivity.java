package com.example.contentproviderexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderOperation;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener addClickListener=new View.OnClickListener() {//creating instance of OnClickListener
            @Override
            public void onClick(View v) {
                EditText name=findViewById(R.id.name);//doing view identification of all the edittexts.
                EditText mobilephone=findViewById(R.id.mobilephone);
                EditText homephone=findViewById(R.id.homephone);
                EditText email=findViewById(R.id.email);

                ArrayList<ContentProviderOperation> cp=new ArrayList<ContentProviderOperation>();//we have created an instance of ArrayList<ContentProviderOperation>
                // ArrayList:-
                /*
                Resizable-array implementation of the List interface. Implements all optional list operations,
                and permits all elements, including null. In addition to implementing the List interface,
                this class provides methods to manipulate the size of the array that is used internally to store the list.
                 */
                // ContentProviderOperation:-
                /*
                => Represents a single operation to be performed as part of a batch of operations.
                => Content Provider facilitates access to a central data store or warehouse to allow
                   data sharing and data manipulation across different applications.
                   -> These are the only way to access information across application in the same device.
                 */
                int rawContactID=cp.size();//size() function returns the no. of elements in the list or array.

                cp.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI)//The URI(Uniform Resource Identifier) that is the target of the operation.
                        .withValue(ContactsContract.RawContacts.ACCOUNT_NAME,null)
                        .withValue(ContactsContract.RawContacts.ACCOUNT_TYPE,null)
                        .build());

                //add:-
                /*
                Appends the specified element to the end of this Arraylist
                 */

                //newInsert:-
                /*
                to add the ArrayList to the actual contacts list.
                 */

                //ContactsContract:-
                /*
                => The contract between the contacts provider and applications. Contains definitions for the supported URIs and columns.
                   These APIs supersede ContactsContract.Contacts.
                => ContactsContract defines an extensible database of contact-related information.
                 */

                //RawContacts:-
                /*
                => Constants for the raw contacts table, which contains one row of contact information for each person in each synced account.
                   Sync adapters and contact management apps are the primary consumers of this API.
                => Aggregation
                   -> As soon as a raw contact is inserted or whenever its constituent data changes, the provider will check if the raw
                      contact matches other existing raw contacts and if so will aggregate it with those. The aggregation is reflected
                      in the ContactsContract.RawContacts table by the change of the CONTACT_ID field, which is the reference to the aggregate contact.
                   -> Changes to the structured name, organization, phone number, email address, or nickname trigger a re-aggregation.
                   -> See also ContactsContract.AggregationExceptions for a mechanism to control aggregation programmatically.
                 */

                //CONTENT_URI:-
                /*
                => It requests a directory of raw contact rows matching the selection criteria.
                */

                //withvalue:-
                /*
                Configure the given value to use for this operation. This method will replace any previously defined value for this key
                 */

                // ACCOUNT_NAME:-
                /*
                The name of the account instance to which this row belongs, which when paired with ACCOUNT_TYPE identifies a specific account.
                 */

                //ACCOUNT_TYPE:-
                /*
                The type of account to which this row belongs, which when paired with ACCOUNT_NAME identifies a specific account.
                 */

                //build():-
                /*
                Create a ContentProviderOperation from this ContentProviderOperation.Builder to build.
                 */

                cp.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,rawContactID)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,name.getText().toString())
                        .build());

                //Data:-
                /*
                Constants for the data table, which contains data points tied to a raw contact. Each row of the data table is typically
                used to store a single piece of contact information (such as a phone number) and its associated metadata (such as whether
                it is a work or home number)
                 */

                //RAW_CONTACT_ID:-
                /*
                it is the refrence to which the data belongs to.
                 */

                //MIMETYPE:-
                /*
                A MIME type is a label used to identify a type of data.
                It is used so software can know how to handle the data. It serves the same purpose on the Internet that file extensions do on Microsoft Windows.
                */

                //CONTENT_ITEM_TYPE:-
                /*
                MIME type used when storing this in data table.
                */

                //DISPLAY_NAME:-
                /*
                The name that should be used to display the contact.
                */

                cp.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,rawContactID)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER,mobilephone.getText().toString())
                        .withValue(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
                        .build());

                cp.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,rawContactID)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER,homephone.getText().toString())
                        .withValue(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_HOME)
                        .build());

                cp.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI)
                        .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,rawContactID)
                        .withValue(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)
                        .withValue(ContactsContract.CommonDataKinds.Email.ADDRESS,email.getText().toString())
                        .withValue(ContactsContract.CommonDataKinds.Email.TYPE, ContactsContract.CommonDataKinds.Email.TYPE_HOME)
                        .build());

                try {
                    getContentResolver().applyBatch(ContactsContract.AUTHORITY,cp);
                    //getContentResolver() :- Return a ContentResolver instance for your application's package.
                    //applyBatch :- Applies each of the ContentProviderOperation objects and returns an array of their results.
                    //AUTHORITY :- The authority for the contacts provider.
                    Toast.makeText(getBaseContext(),"Contact is successfully added",Toast.LENGTH_LONG).show();
                    //getBaseContext() :- Returns the base context as set by the constructor or setBaseContext
                }catch (RemoteException e){//RemoteException :- Parent exception for all Binder remote-invocation errors.
                    e.printStackTrace();//Prints this throwable and its backtrace to the standard error stream. This method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err
                }catch (OperationApplicationException e){//Thrown when an application of a ContentProviderOperation fails due the specified constraints.
                    e.printStackTrace();
                }
            }
        };
                View.OnClickListener contactsClickListener=new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent contacts=new Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI);
                        //ACTION_VIEW :-
                        /*
                          Activity Action: Display the data to the user. This is the most common action performed on data -- it is the generic
                          action you can use on a piece of data to get the most reasonable thing to occur. For example, when used on a contacts
                          entry it will view the entry; when used on a mailto: URI it will bring up a compose window filled with the information
                          supplied by the URI; when used with a tel: URI it will invoke the dialer.
                          Input: getData is URI from which to retrieve data.
                        */
                        startActivity(contacts);
                    }
                };

                Button add=findViewById(R.id.add);
                Button contact=findViewById(R.id.contact);
                add.setOnClickListener(addClickListener);
                contact.setOnClickListener(contactsClickListener);

    }
}